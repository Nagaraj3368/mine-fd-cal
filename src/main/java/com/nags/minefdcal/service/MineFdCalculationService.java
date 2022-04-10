package com.nags.minefdcal.service;

import com.nags.minefdcal.constants.MineCalculationConstants;
import com.nags.minefdcal.model.MineCalculationDTO;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@Service
public class MineFdCalculationService {

    public MineCalculationDTO calculate(MineCalculationDTO mineCalculationDTO) {

        // No of strips
        mineCalculationDTO.setCalAntiPerStrip(mineCalculationDTO.getAntiPerStrip().divide(MineCalculationConstants.SD_ANTI_PERS_STRIP));
        mineCalculationDTO.setCalAntiTankStrip(mineCalculationDTO.getAntiTankStrip().divide(MineCalculationConstants.SD_ANTI_TANK_STRIP, 0, RoundingMode.HALF_UP));

        String fragStrip = mineCalculationDTO.getFragStrip();
        BigDecimal enteredFragStrpValue = BigDecimal.ZERO;
        if (!StringUtils.isEmpty(fragStrip) && fragStrip.contains("/")) {
            BigDecimal dividend = new BigDecimal(fragStrip.substring(0, fragStrip.indexOf("/")));
            BigDecimal divisor = new BigDecimal(fragStrip.substring(fragStrip.indexOf("/") + 1));
            enteredFragStrpValue = dividend.divide(divisor);
            mineCalculationDTO.setCalFragStrip(enteredFragStrpValue.divide(MineCalculationConstants.SD_FRAG_STRIP, 0, RoundingMode.HALF_UP));
        }

        if (mineCalculationDTO.getCalAntiPerStrip().compareTo(mineCalculationDTO.getCalAntiTankStrip()) > 0) {
            if (mineCalculationDTO.getCalAntiPerStrip().compareTo(mineCalculationDTO.getCalFragStrip()) > 0) {
                mineCalculationDTO.setNoOfStrips(mineCalculationDTO.getCalAntiPerStrip().intValue());
            } else {
                mineCalculationDTO.setNoOfStrips(mineCalculationDTO.getCalFragStrip().intValue());

            }
        } else if (mineCalculationDTO.getCalAntiTankStrip().compareTo(mineCalculationDTO.getCalFragStrip()) > 0) {
            mineCalculationDTO.setNoOfStrips(mineCalculationDTO.getCalAntiTankStrip().intValue());
        } else {
            mineCalculationDTO.setNoOfStrips(mineCalculationDTO.getCalFragStrip().intValue());
        }

        // No of Mines
        Integer antiPeerMine1 = mineCalculationDTO.getFrontage().multiply(mineCalculationDTO.getAntiPerStrip()).intValue();
        int antiPeerMine = antiPeerMine1 + (antiPeerMine1.intValue() / 10);
        mineCalculationDTO.setAntiPersMine(antiPeerMine);

        Integer antitankMine1 = mineCalculationDTO.getFrontage().multiply(mineCalculationDTO.getAntiTankStrip()).intValue();
        int antiTankMine = antitankMine1 + (antitankMine1.intValue() / 10);
        mineCalculationDTO.setAntiTankMine(antiTankMine);

        Integer fragMine1 = mineCalculationDTO.getFrontage().multiply(enteredFragStrpValue).intValue();
        int fragMine = fragMine1 + (fragMine1.intValue() / 10);
        mineCalculationDTO.setFragMine(fragMine);

        int totalMines = antiPeerMine + antiTankMine + fragMine;
        mineCalculationDTO.setTotalMines(totalMines);

        // Stores calculation
        //liap
        BigDecimal liap1 = mineCalculationDTO.getFrontage().multiply(new BigDecimal(2)).add(mineCalculationDTO.getDept().multiply(new BigDecimal(2))).divide(new BigDecimal(12.5));
        BigDecimal liap = liap1.add(liap1.divide(new BigDecimal(10))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setLaip(liap);

        //Barbed wire
        BigDecimal barbedWireBundle1 = mineCalculationDTO.getFrontage().multiply(new BigDecimal(4)).add(mineCalculationDTO.getDept().multiply(new BigDecimal(4))).divide(new BigDecimal(100));
        BigDecimal barbedWireBundle = barbedWireBundle1.add(barbedWireBundle1.divide(new BigDecimal(10))).setScale(0, RoundingMode.UP);
        ;
        mineCalculationDTO.setBarbedWireBundle(barbedWireBundle);

        // PMS
        BigDecimal pms1 = mineCalculationDTO.getFrontage().multiply(new BigDecimal(2)).add(mineCalculationDTO.getDept().multiply(new BigDecimal(2))).divide(new BigDecimal(50));
        BigDecimal pms = pms1.add(pms1.divide(new BigDecimal(10))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setPms(pms);
        mineCalculationDTO.setNoOfSHooks(pms);

        //BindingWire
        BigDecimal bindingWireInMtrs = pms.multiply(new BigDecimal(15)).divide(new BigDecimal(100));
        mineCalculationDTO.setBindingWireInMtrs(bindingWireInMtrs);
        BigDecimal bindingWire = bindingWireInMtrs.divide(new BigDecimal(20), 2, RoundingMode.UP);
        mineCalculationDTO.setBindingWire(bindingWire);

        //Marked Tape
        BigDecimal markedTape1 = mineCalculationDTO.getFrontage().multiply(new BigDecimal(mineCalculationDTO.getNoOfStrips()));
        BigDecimal markedTape2 = (markedTape1.add(markedTape1.divide(new BigDecimal(10)))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setMarkedTapeInMtr(markedTape2);
        BigDecimal markedTape = markedTape2.divide(new BigDecimal(365), 0, RoundingMode.UP);
        mineCalculationDTO.setMarkedTape(markedTape);

        //Taping Pin
        BigDecimal tapingPin = markedTape2.divide(new BigDecimal(20)).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTapingPin(tapingPin);

        //SAIP
        BigDecimal saip1 = mineCalculationDTO.getFrontage().multiply(new BigDecimal(mineCalculationDTO.getNoOfStrips())).multiply(new BigDecimal(0.0266));
        saip1 = (saip1.add(saip1.divide(new BigDecimal(10)))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setSaip(saip1);

        // Navigation stores
        // Un marked tap
        BigDecimal unMarkedTap = new BigDecimal(mineCalculationDTO.getNoOfStrips().intValue()).multiply(mineCalculationDTO.getFrontage());
        unMarkedTap = (unMarkedTap.add(unMarkedTap.divide(new BigDecimal(10)))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setUnMarkedTape(unMarkedTap);

        //Guide tap
        BigDecimal guidTape = mineCalculationDTO.getDept().add(new BigDecimal(200));
        mineCalculationDTO.setGuideTape(guidTape);

        //return Guid Tap
        BigDecimal returnGuideTapeInMtr = mineCalculationDTO.getFrontage().add(mineCalculationDTO.getDept()).add(new BigDecimal(200));
        mineCalculationDTO.setReturnGuideTape(returnGuideTapeInMtr.setScale(0, RoundingMode.UP));

        BigDecimal totalUnMarkedTapeInMtr = (returnGuideTapeInMtr.add(unMarkedTap).add(guidTape)).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTotalUnMarkTapeInMtrs(totalUnMarkedTapeInMtr);
        BigDecimal totalUnMarkedTapeInReels = totalUnMarkedTapeInMtr.divide(new BigDecimal(365),0, RoundingMode.UP);
        mineCalculationDTO.setTotalUnMarkTapeInReels(totalUnMarkedTapeInReels);

        //saip1
        BigDecimal saip11 = totalUnMarkedTapeInMtr.divide(new BigDecimal(50),2, RoundingMode.UP).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setSaip1(saip11);

        //night sign board
        int nightSignBoard = (mineCalculationDTO.getNoOfStrips() * 2) + 10;
        mineCalculationDTO.setNightSignBoards(new BigDecimal(nightSignBoard));

        //ALD calculation
        BigDecimal aldCal = new BigDecimal(mineCalculationDTO.getAntiTankMine()).divide(new BigDecimal(10)).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setAldStore(aldCal);

        // Trip flare
        BigDecimal tripFlare = mineCalculationDTO.getFrontage().divide(new BigDecimal(20));
        tripFlare = (tripFlare.add(tripFlare.divide(new BigDecimal(10)))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTripFlare(tripFlare);

        //unmarked tape
        BigDecimal unmarkedTape1 = (mineCalculationDTO.getIsl().add(mineCalculationDTO.getVsl())).multiply(mineCalculationDTO.getDept());
        unmarkedTape1 = (unmarkedTape1.add(unmarkedTape1.divide(new BigDecimal(10))));
        mineCalculationDTO.setUnMarkedTape1InMtr(unmarkedTape1);
        BigDecimal unmarkedTape = unmarkedTape1.divide(new BigDecimal(365),2, RoundingMode.UP).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setUnMarkedTape1(unmarkedTape);

        //saip
        mineCalculationDTO.setSaip2(unmarkedTape1.setScale(0, RoundingMode.UP));

        //saip3

        BigDecimal saip3 = mineCalculationDTO.getSaip2().divide(new BigDecimal(20), 2, RoundingMode.UP);
        mineCalculationDTO.setSaip3(saip3.setScale(0, RoundingMode.UP));

        // Transportation
        mineCalculationDTO.setTran_antiPeer(new BigDecimal(totalMines).divide(new BigDecimal(8000),2, RoundingMode.UP).setScale(0, RoundingMode.UP));
        mineCalculationDTO.setTran_antiTank(new BigDecimal(totalMines).divide(new BigDecimal(225),2, RoundingMode.UP).setScale(0, RoundingMode.UP));
        mineCalculationDTO.setTran_fragMine(new BigDecimal(totalMines).divide(new BigDecimal(700),2, RoundingMode.UP).setScale(0, RoundingMode.UP));

        //Marking stores
        BigDecimal markingStore1 = ((mineCalculationDTO.getFrontage().add(mineCalculationDTO.getDept())).multiply(new BigDecimal(2))).divide(new BigDecimal(3300),2, RoundingMode.UP);
        BigDecimal markingStore = markingStore1.setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTran_markingStores(markingStore);
        mineCalculationDTO.setTran_settingOutStores(BigDecimal.ONE);
        mineCalculationDTO.setTran_navigationStores(BigDecimal.ONE);
        BigDecimal totalALS = mineCalculationDTO.getTran_antiPeer().add(mineCalculationDTO.getTran_antiTank()).add(mineCalculationDTO.getTran_fragMine()).add(mineCalculationDTO.getTran_markingStores()).add(mineCalculationDTO.getTran_settingOutStores()).add(mineCalculationDTO.getTran_navigationStores());
        mineCalculationDTO.setTran_totalAls(totalALS);

        BigDecimal totalMlp = new BigDecimal(totalMines).divide(new BigDecimal(700), 2, RoundingMode.UP).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTran_totalNoOfMLP(totalMlp);
        return mineCalculationDTO;
    }

}
