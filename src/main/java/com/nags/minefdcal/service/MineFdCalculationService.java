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

        String antiPerStrip = mineCalculationDTO.getAntiPerStripStr();
        BigDecimal enteredAntiPerStripValue;
        if (!StringUtils.isEmpty(antiPerStrip) && antiPerStrip.contains("/")) {
            BigDecimal dividend = new BigDecimal(antiPerStrip.substring(0, antiPerStrip.indexOf("/")));
            BigDecimal divisor = new BigDecimal(antiPerStrip.substring(antiPerStrip.indexOf("/") + 1));
            enteredAntiPerStripValue = dividend.divide(divisor, 4, RoundingMode.HALF_UP);
        } else {
            enteredAntiPerStripValue = new BigDecimal(antiPerStrip);
        }
        mineCalculationDTO.setAntiPerStrip(enteredAntiPerStripValue);

        String antiTankStripStr = mineCalculationDTO.getAntiTankStripStr();
        BigDecimal enteredAntiTankStripValue;
        if (!StringUtils.isEmpty(antiTankStripStr) && antiTankStripStr.contains("/")) {
            BigDecimal dividend = new BigDecimal(antiTankStripStr.substring(0, antiTankStripStr.indexOf("/")));
            BigDecimal divisor = new BigDecimal(antiTankStripStr.substring(antiTankStripStr.indexOf("/") + 1));
            enteredAntiTankStripValue = dividend.divide(divisor, 4, RoundingMode.HALF_UP);
        } else {
            enteredAntiTankStripValue = new BigDecimal(antiTankStripStr);
        }

        mineCalculationDTO.setAntiTankStrip(enteredAntiTankStripValue);

        // No of strips
        mineCalculationDTO.setCalAntiPerStrip(mineCalculationDTO.getAntiPerStrip().divide(MineCalculationConstants.SD_ANTI_PERS_STRIP, 2, RoundingMode.HALF_UP).setScale(0, RoundingMode.UP));
        mineCalculationDTO.setCalAntiTankStrip(mineCalculationDTO.getAntiTankStrip().divide(MineCalculationConstants.SD_ANTI_TANK_STRIP, 2, RoundingMode.HALF_UP).setScale(0, RoundingMode.UP));

        String fragStrip = mineCalculationDTO.getFragStrip();
        BigDecimal enteredFragStrpValue;
        if (!StringUtils.isEmpty(fragStrip) && fragStrip.contains("/")) {
            BigDecimal dividend = new BigDecimal(fragStrip.substring(0, fragStrip.indexOf("/")));
            BigDecimal divisor = new BigDecimal(fragStrip.substring(fragStrip.indexOf("/") + 1));
            enteredFragStrpValue = dividend.divide(divisor, 4, RoundingMode.HALF_UP);
        } else {
            enteredFragStrpValue = new BigDecimal(fragStrip);
        }

        mineCalculationDTO.setCalFragStrip(enteredFragStrpValue.divide(MineCalculationConstants.SD_FRAG_STRIP, 2, RoundingMode.HALF_UP).setScale(0, RoundingMode.UP));

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
        BigDecimal antiPeerMine1 = mineCalculationDTO.getFrontage().multiply(mineCalculationDTO.getAntiPerStrip());
        BigDecimal antiPeerMine = antiPeerMine1.add(antiPeerMine1.divide(new BigDecimal(10))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setAntiPersMine(antiPeerMine.intValue());

        BigDecimal antitankMine1 = mineCalculationDTO.getFrontage().multiply(mineCalculationDTO.getAntiTankStrip());
        BigDecimal antiTankMine = antitankMine1.add(antitankMine1.divide(new BigDecimal(10))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setAntiTankMine(antiTankMine.intValue());

        BigDecimal fragMine1 = mineCalculationDTO.getFrontage().multiply(enteredFragStrpValue);
        BigDecimal fragMine = fragMine1.add(fragMine1.divide(new BigDecimal(10))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setFragMine(fragMine.intValue());

        int totalMines = antiPeerMine.intValue() + antiTankMine.intValue() + fragMine.intValue();
        mineCalculationDTO.setTotalMines(totalMines);

        //Mines on Strip calculation
        //nmm-14
        if (mineCalculationDTO.getSsmToTp1().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal nmm_ssmToTp1 = (mineCalculationDTO.getSsmToTp1().subtract(new BigDecimal(6)).divide(mineCalculationDTO.getAntiPerD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setNmm_ssmToTp1(nmm_ssmToTp1);
        }

        if (mineCalculationDTO.getTp1ToTp2().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal nmm_tp1ToTp2 = (mineCalculationDTO.getTp1ToTp2().subtract(new BigDecimal(9)).divide(mineCalculationDTO.getAntiPerD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setNmm_tp1ToTp2(nmm_tp1ToTp2);
        }

        if (mineCalculationDTO.getTp2ToTp3().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal nmm_tp2ToTp3 = (mineCalculationDTO.getTp2ToTp3().subtract(new BigDecimal(9)).divide(mineCalculationDTO.getAntiPerD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setNmm_tp2ToTp3(nmm_tp2ToTp3);
        }

        if (mineCalculationDTO.getTp3ToTp4().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal nmm_tp3ToTp4 = (mineCalculationDTO.getTp3ToTp4().subtract(new BigDecimal(9)).divide(mineCalculationDTO.getAntiPerD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setNmm_tp3ToTp4(nmm_tp3ToTp4);
        }

        if (mineCalculationDTO.getTp4ToESM().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal nmm_tp4ToESM = (mineCalculationDTO.getTp4ToESM().subtract(new BigDecimal(9)).divide(mineCalculationDTO.getAntiPerD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setNmm_tp4ToESM(nmm_tp4ToESM);
        }

        //M-16
        if (mineCalculationDTO.getSsmToTp1().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal m_ssmToTp1 = (mineCalculationDTO.getSsmToTp1().subtract(new BigDecimal(12)).divide(new BigDecimal(12), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setM_ssmToTp1(m_ssmToTp1);
        }

        if (mineCalculationDTO.getTp1ToTp2().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal m_tp1ToTp2 = (mineCalculationDTO.getTp1ToTp2().subtract(new BigDecimal(15)).divide(new BigDecimal(12), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setM_tp1ToTp2(m_tp1ToTp2);
        }

        if (mineCalculationDTO.getTp2ToTp3().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal m_tp2ToTp3 = (mineCalculationDTO.getTp2ToTp3().subtract(new BigDecimal(15)).divide(new BigDecimal(12), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setM_tp2ToTp3(m_tp2ToTp3);
        }

        if (mineCalculationDTO.getTp3ToTp4().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal m_tp3ToTp4 = (mineCalculationDTO.getTp3ToTp4().subtract(new BigDecimal(15)).divide(new BigDecimal(12), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setM_tp3ToTp4(m_tp3ToTp4);
        }

        if (mineCalculationDTO.getTp4ToESM().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal m_tp4ToESM = (mineCalculationDTO.getTp4ToESM().subtract(new BigDecimal(15)).divide(new BigDecimal(12), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setM_tp4ToESM(m_tp4ToESM);
        }

        //A/tank Mine MK-1
        if (mineCalculationDTO.getSsmToTp1().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal anti_Tank_mk_ssmToTp1 = (mineCalculationDTO.getSsmToTp1().subtract(new BigDecimal(9)).divide(mineCalculationDTO.getAntiTankD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setAnti_Tank_mk_ssmToTp1(anti_Tank_mk_ssmToTp1);
        }


        if (mineCalculationDTO.getTp1ToTp2().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal anti_Tank_mk_tp1ToTp2 = (mineCalculationDTO.getTp1ToTp2().subtract(new BigDecimal(12)).divide(mineCalculationDTO.getAntiTankD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setAnti_Tank_mk_tp1ToTp2(anti_Tank_mk_tp1ToTp2);
        }


        if (mineCalculationDTO.getTp2ToTp3().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal anti_Tank_mk_tp2ToTp3 = (mineCalculationDTO.getTp2ToTp3().subtract(new BigDecimal(12)).divide(mineCalculationDTO.getAntiTankD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setAnti_Tank_mk_tp2ToTp3(anti_Tank_mk_tp2ToTp3);
        }


        if (mineCalculationDTO.getTp3ToTp4().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal anti_Tank_mk_tp3ToTp4 = (mineCalculationDTO.getTp3ToTp4().subtract(new BigDecimal(12)).divide(mineCalculationDTO.getAntiTankD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setAnti_Tank_mk_tp3ToTp4(anti_Tank_mk_tp3ToTp4);
        }


        if (mineCalculationDTO.getTp4ToESM().compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal anti_Tank_mk_tp4ToESM = (mineCalculationDTO.getTp4ToESM().subtract(new BigDecimal(12)).divide(mineCalculationDTO.getAntiTankD(), 2, RoundingMode.UP)).add(new BigDecimal(1));
            mineCalculationDTO.setAnti_Tank_mk_tp4ToESM(anti_Tank_mk_tp4ToESM);
        }


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

        // Nylon Rope cal
        BigDecimal nylonRope1 = (mineCalculationDTO.getFrontage().add(mineCalculationDTO.getDept())).multiply(new BigDecimal(4));
        BigDecimal nyloneRope = nylonRope1.add(nylonRope1.divide(new BigDecimal(10), 2, RoundingMode.UP)).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setNylonRopeInMtr(nyloneRope);

        //BindingWire
        BigDecimal bindingWireInMtrs = pms.multiply(new BigDecimal(15)).divide(new BigDecimal(100), 2, RoundingMode.UP);
        mineCalculationDTO.setBindingWireInMtrs(bindingWireInMtrs);
        BigDecimal bindingWire = bindingWireInMtrs.divide(new BigDecimal(20), 2, RoundingMode.UP);
        mineCalculationDTO.setBindingWire(bindingWire);

        //Marked Tape
        BigDecimal markedTape1 = mineCalculationDTO.getFrontage().multiply(new BigDecimal(mineCalculationDTO.getNoOfStrips()));
        BigDecimal markedTape2 = (markedTape1.add(markedTape1.divide(new BigDecimal(10), 2, RoundingMode.UP))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setMarkedTapeInMtr(markedTape2);
        BigDecimal markedTape = markedTape2.divide(new BigDecimal(365), 0, RoundingMode.UP);
        mineCalculationDTO.setMarkedTape(markedTape);

        BigDecimal m_markedTape = (mineCalculationDTO.getNoOfTP().add(new BigDecimal(1))).multiply(mineCalculationDTO.getFrontage());
        BigDecimal m_markedTapeInMtr = (m_markedTape.add(m_markedTape.divide(new BigDecimal(10), 2, RoundingMode.UP))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setM_markedTapeInMtr(m_markedTapeInMtr);

        BigDecimal m_markedTapeInReel = m_markedTapeInMtr.divide(new BigDecimal(365), 0, RoundingMode.UP);
        mineCalculationDTO.setM_markedTapeInReel(m_markedTapeInReel);

        BigDecimal m_saip = (mineCalculationDTO.getNoOfTP().multiply(new BigDecimal(2))).add(new BigDecimal(2));
        m_saip = (m_saip.add(m_saip.divide(new BigDecimal(10), 2, RoundingMode.UP))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setM_saip(m_saip);

        //Taping Pin
        BigDecimal tapingPin = markedTape2.divide(new BigDecimal(20)).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTapingPin(tapingPin);

        //SAIP
        BigDecimal saip1 = mineCalculationDTO.getFrontage().multiply(new BigDecimal(mineCalculationDTO.getNoOfStrips())).multiply(new BigDecimal(0.0266));
        saip1 = (saip1.add(saip1.divide(new BigDecimal(10)))).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setSaip(saip1);

        // Navigation stores
        // Un marked tap
        BigDecimal unMarkedTap = new BigDecimal(mineCalculationDTO.getNoOfStrips().intValue() - 1).multiply(mineCalculationDTO.getFrontage());
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
        BigDecimal totalUnMarkedTapeInReels = totalUnMarkedTapeInMtr.divide(new BigDecimal(365), 0, RoundingMode.UP);
        mineCalculationDTO.setTotalUnMarkTapeInReels(totalUnMarkedTapeInReels);

        //saip1
        BigDecimal saip11 = totalUnMarkedTapeInMtr.divide(new BigDecimal(50), 2, RoundingMode.UP).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setSaip1(saip11);

        //night sign board
        int nightSignBoard = (mineCalculationDTO.getNoOfStrips() * 2) + 10;
        mineCalculationDTO.setNightSignBoards(new BigDecimal(nightSignBoard));

        //ALD calculation
        BigDecimal aldCal = new BigDecimal(mineCalculationDTO.getAntiTankMine()).divide(new BigDecimal(10)).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setAldStore(aldCal);

        // Trip flare
        BigDecimal tripFlare = mineCalculationDTO.getFrontage().divide(new BigDecimal(20), 2, RoundingMode.UP);
        mineCalculationDTO.setTripFlare(tripFlare);

        //unmarked tape
        BigDecimal unmarkedTape1 = (mineCalculationDTO.getIsl().add(mineCalculationDTO.getVsl().multiply(new BigDecimal(2)))).multiply(mineCalculationDTO.getDept());
        unmarkedTape1 = (unmarkedTape1.add(unmarkedTape1.divide(new BigDecimal(10), 2, RoundingMode.UP)));
        mineCalculationDTO.setUnMarkedTape1InMtr(unmarkedTape1);
        BigDecimal unmarkedTape = unmarkedTape1.divide(new BigDecimal(365), 2, RoundingMode.UP).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setUnMarkedTape1(unmarkedTape);

        //saip
        mineCalculationDTO.setSaip2(unmarkedTape1);

        //saip3

        BigDecimal saip3 = mineCalculationDTO.getSaip2().divide(new BigDecimal(20), 2, RoundingMode.UP);
        mineCalculationDTO.setSaip3(saip3.setScale(0, RoundingMode.UP));

        // Transportation
        mineCalculationDTO.setTran_antiPeer(new BigDecimal(mineCalculationDTO.getAntiPersMine()).divide(new BigDecimal(8000), 2, RoundingMode.HALF_UP));
        mineCalculationDTO.setTran_antiTank(new BigDecimal(mineCalculationDTO.getAntiTankMine()).divide(new BigDecimal(225), 2, RoundingMode.HALF_UP));
        mineCalculationDTO.setTran_fragMine(new BigDecimal(mineCalculationDTO.getFragMine()).divide(new BigDecimal(700), 2, RoundingMode.HALF_UP));
        BigDecimal alsOnMine = mineCalculationDTO.getTran_antiPeer().add(mineCalculationDTO.getTran_antiTank()).add(mineCalculationDTO.getTran_fragMine()).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTran_alsOnMines(alsOnMine);


        //Marking stores
        BigDecimal markingStore1 = ((mineCalculationDTO.getFrontage().add(mineCalculationDTO.getDept())).multiply(new BigDecimal(2))).divide(new BigDecimal(3300), 2, RoundingMode.UP);
        BigDecimal markingStore = markingStore1.setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTran_markingStores(markingStore);
        mineCalculationDTO.setTran_settingOutStores(BigDecimal.ONE);
        mineCalculationDTO.setTran_navigationStores(BigDecimal.ONE);
        BigDecimal totalALS = mineCalculationDTO.getTran_antiPeer().add(mineCalculationDTO.getTran_antiTank()).add(mineCalculationDTO.getTran_fragMine()).add(mineCalculationDTO.getTran_markingStores()).add(mineCalculationDTO.getTran_settingOutStores()).add(mineCalculationDTO.getTran_navigationStores());
        mineCalculationDTO.setTran_totalAls(totalALS.setScale(0, BigDecimal.ROUND_UP));

        BigDecimal totalMlp = new BigDecimal(totalMines).divide(new BigDecimal(700), 2, RoundingMode.UP).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTran_totalNoOfMLP(totalMlp);

        BigDecimal totalMlp1 = new BigDecimal(totalMines).divide(new BigDecimal(500), 2, RoundingMode.UP).setScale(0, RoundingMode.UP);
        mineCalculationDTO.setTran_totalNoOfMLP1(totalMlp1);

        return mineCalculationDTO;
    }

}
