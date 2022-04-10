package com.nags.minefdcal.controller;

import com.nags.minefdcal.model.MineCalculationDTO;
import com.nags.minefdcal.service.MineFdCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MineFDCalculationController {

    @Autowired
    MineFdCalculationService mineFdCalculationService;

    @PostMapping(path = "/startCalculation")
    public ModelAndView startCalculation(@RequestParam Map<String, String> body) {

        MineCalculationDTO mineCalculationDTO = new MineCalculationDTO();
        mineCalculationDTO.setFrontage(new BigDecimal(body.get("frontage")));
        mineCalculationDTO.setDept(new BigDecimal(body.get("dept")));
        mineCalculationDTO.setAntiPerStrip(new BigDecimal(body.get("antiPerStrip")));
        mineCalculationDTO.setAntiTankStrip(new BigDecimal(body.get("antiTankStrip")));
        mineCalculationDTO.setFragStrip(body.get("fragStrip"));
        mineCalculationDTO.setVsl(new BigDecimal(body.get("vsl")));
        mineCalculationDTO.setIsl(new BigDecimal(body.get("isl")));

        MineCalculationDTO calculatedDTO = mineFdCalculationService.calculate(mineCalculationDTO);
        Map<String, Object> map = new HashMap<>(body);
        map.put("calAntiPerStrip", calculatedDTO.getCalAntiPerStrip());
        map.put("calAntiTankStrip", calculatedDTO.getCalAntiTankStrip());
        map.put("calFragStrip", calculatedDTO.getCalFragStrip());
        map.put("noOfStrips", calculatedDTO.getNoOfStrips());

        map.put("calAntiPerMine", calculatedDTO.getAntiPersMine());
        map.put("calAntiTankMine", calculatedDTO.getAntiTankMine());
        map.put("calFragMine", calculatedDTO.getFragMine());
        map.put("noOfMine", calculatedDTO.getTotalMines());

        map.put("laip", calculatedDTO.getLaip());
        map.put("barbedWireBundle", calculatedDTO.getBarbedWireBundle());
        map.put("pms", calculatedDTO.getPms());
        map.put("bindingWire", calculatedDTO.getBindingWire());
        map.put("bindingWireInMtrs", calculatedDTO.getBindingWireInMtrs());
        map.put("noOfSHook", calculatedDTO.getNoOfSHooks());
        map.put("nylonRopeInMtr", calculatedDTO.getNylonRopeInMtr());

        map.put("markedTape", calculatedDTO.getMarkedTape());
        map.put("markedTapeInMtr", calculatedDTO.getMarkedTapeInMtr());
        map.put("tapingPin", calculatedDTO.getTapingPin());
        map.put("saip", calculatedDTO.getSaip());

        map.put("unMarkedTape", calculatedDTO.getUnMarkedTape());
        map.put("guideTape", calculatedDTO.getGuideTape());
        map.put("returnGuideTape", calculatedDTO.getReturnGuideTape());
        map.put("totalUnMarkTapeInMtrs", calculatedDTO.getTotalUnMarkTapeInMtrs());
        map.put("totalUnMarkTapeInReels", calculatedDTO.getTotalUnMarkTapeInReels());
        map.put("saip1", calculatedDTO.getSaip1());
        map.put("nightSignBoards", calculatedDTO.getNightSignBoards());
        map.put("aldStore", calculatedDTO.getAldStore());
        map.put("tripFlare", calculatedDTO.getTripFlare());
        map.put("unMarkedTape1", calculatedDTO.getUnMarkedTape1());
        map.put("unMarkedTape1InMtr", calculatedDTO.getUnMarkedTape1InMtr());
        map.put("saip2", calculatedDTO.getSaip2());
        map.put("saip3", calculatedDTO.getSaip3());


        map.put("tran_antiPeer", calculatedDTO.getTran_antiPeer());
        map.put("tran_antiTank", calculatedDTO.getTran_antiTank());
        map.put("tran_fragMine", calculatedDTO.getTran_fragMine());
        map.put("tran_markingStores", calculatedDTO.getTran_markingStores());
        map.put("tran_settingOutStores", calculatedDTO.getTran_settingOutStores());
        map.put("tran_navigationStores", calculatedDTO.getTran_navigationStores());
        map.put("tran_totalAls", calculatedDTO.getTran_totalAls());


        map.put("tran_totalNoOfMLP", calculatedDTO.getTran_totalNoOfMLP());
        map.put("tran_totalNoOfMLP1", calculatedDTO.getTran_totalNoOfMLP1());


        ModelAndView model = new ModelAndView();
        model.addAllObjects(map);

        model.setViewName("home.html");
        return model;
    }
}
