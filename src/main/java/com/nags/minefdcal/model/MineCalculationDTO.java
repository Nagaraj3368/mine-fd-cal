package com.nags.minefdcal.model;

import java.math.BigDecimal;


public class MineCalculationDTO {


    private BigDecimal frontage = BigDecimal.ZERO;

    private BigDecimal dept = BigDecimal.ZERO;

    private BigDecimal antiPerStrip = BigDecimal.ZERO;

    private String antiPerStripStr;

    private BigDecimal calAntiPerStrip = BigDecimal.ZERO;

    private BigDecimal antiTankStrip = BigDecimal.ZERO;

    private String antiTankStripStr;

    private BigDecimal calAntiTankStrip = BigDecimal.ZERO;

    private String fragStrip;

    private BigDecimal calFragStrip = BigDecimal.ZERO;

    private BigDecimal vsl = BigDecimal.ZERO;

    private BigDecimal isl = BigDecimal.ZERO;

    private Integer noOfStrips = 0;

    private Integer antiPersMine = 0;

    private Integer antiTankMine = 0;

    private Integer fragMine = 0;

    private Integer totalMines = 0;

    private BigDecimal laip = BigDecimal.ZERO;

    private BigDecimal barbedWireBundle = BigDecimal.ZERO;

    private BigDecimal pms = BigDecimal.ZERO;

    private BigDecimal bindingWire = BigDecimal.ZERO;

    private BigDecimal bindingWireInMtrs = BigDecimal.ZERO;

    private BigDecimal noOfSHooks = BigDecimal.ZERO;
    private BigDecimal nylonRopeInMtr = BigDecimal.ZERO;

    private BigDecimal markedTape = BigDecimal.ZERO;

    private BigDecimal markedTapeInMtr = BigDecimal.ZERO;
    private BigDecimal m_markedTapeInMtr = BigDecimal.ZERO;
    private BigDecimal m_markedTapeInReel = BigDecimal.ZERO;

    private BigDecimal tapingPin = BigDecimal.ZERO;

    private BigDecimal saip = BigDecimal.ZERO;
    private BigDecimal m_saip = BigDecimal.ZERO;


    private BigDecimal unMarkedTape = BigDecimal.ZERO;
    private BigDecimal guideTape = BigDecimal.ZERO;
    private BigDecimal returnGuideTape = BigDecimal.ZERO;

    private BigDecimal totalUnMarkTapeInMtrs = BigDecimal.ZERO;

    private BigDecimal totalUnMarkTapeInReels = BigDecimal.ZERO;

    private BigDecimal saip1 = BigDecimal.ZERO;
    private BigDecimal nightSignBoards = BigDecimal.ZERO;
    private BigDecimal aldStore = BigDecimal.ZERO;
    private BigDecimal tripFlare = BigDecimal.ZERO;
    private BigDecimal unMarkedTape1 = BigDecimal.ZERO;

    private BigDecimal unMarkedTape1InMtr = BigDecimal.ZERO;
    private BigDecimal saip2 = BigDecimal.ZERO;
    private BigDecimal saip3 = BigDecimal.ZERO;

    private BigDecimal tran_antiPeer = BigDecimal.ZERO;
    private BigDecimal tran_antiTank = BigDecimal.ZERO;
    private BigDecimal tran_fragMine = BigDecimal.ZERO;
    private BigDecimal tran_alsOnMines= BigDecimal.ZERO;

    private BigDecimal tran_totalAls = BigDecimal.ZERO;
    private BigDecimal tran_markingStores = BigDecimal.ZERO;
    private BigDecimal tran_settingOutStores = BigDecimal.ZERO;
    private BigDecimal tran_navigationStores = BigDecimal.ZERO;
    private BigDecimal tran_totalNoOfMLP = BigDecimal.ZERO;
    private BigDecimal tran_totalNoOfMLP1 = BigDecimal.ZERO;
    private BigDecimal ssmToTp1 = BigDecimal.ZERO;
    private BigDecimal tp1ToTp2 = BigDecimal.ZERO;
    private BigDecimal tp2ToTp3 = BigDecimal.ZERO;
    private BigDecimal tp3ToTp4 = BigDecimal.ZERO;
    private BigDecimal tp4ToESM = BigDecimal.ZERO;
    private BigDecimal antiPerD = BigDecimal.ZERO;
    private BigDecimal antiTankD = BigDecimal.ZERO;

    private BigDecimal nmm_ssmToTp1 = BigDecimal.ZERO;
    private BigDecimal nmm_tp1ToTp2 = BigDecimal.ZERO;
    private BigDecimal nmm_tp2ToTp3 = BigDecimal.ZERO;
    private BigDecimal nmm_tp3ToTp4 = BigDecimal.ZERO;
    private BigDecimal nmm_tp4ToESM = BigDecimal.ZERO;

    private BigDecimal m_ssmToTp1 = BigDecimal.ZERO;
    private BigDecimal m_tp1ToTp2 = BigDecimal.ZERO;
    private BigDecimal m_tp2ToTp3 = BigDecimal.ZERO;
    private BigDecimal m_tp3ToTp4 = BigDecimal.ZERO;
    private BigDecimal m_tp4ToESM = BigDecimal.ZERO;

    private BigDecimal anti_Tank_mk_ssmToTp1 = BigDecimal.ZERO;
    private BigDecimal anti_Tank_mk_tp1ToTp2 = BigDecimal.ZERO;
    private BigDecimal anti_Tank_mk_tp2ToTp3 = BigDecimal.ZERO;
    private BigDecimal anti_Tank_mk_tp3ToTp4 = BigDecimal.ZERO;
    private BigDecimal anti_Tank_mk_tp4ToESM = BigDecimal.ZERO;
    private BigDecimal noOfTP = BigDecimal.ZERO;

    public String getAntiPerStripStr() {
        return antiPerStripStr;
    }

    public void setAntiPerStripStr(String antiPerStripStr) {
        this.antiPerStripStr = antiPerStripStr;
    }

    public String getAntiTankStripStr() {
        return antiTankStripStr;
    }

    public void setAntiTankStripStr(String antiTankStripStr) {
        this.antiTankStripStr = antiTankStripStr;
    }

    public BigDecimal getM_markedTapeInReel() {
        return m_markedTapeInReel;
    }

    public void setM_markedTapeInReel(BigDecimal m_markedTapeInReel) {
        this.m_markedTapeInReel = m_markedTapeInReel;
    }

    public BigDecimal getM_markedTapeInMtr() {
        return m_markedTapeInMtr;
    }

    public void setM_markedTapeInMtr(BigDecimal m_markedTapeInMtr) {
        this.m_markedTapeInMtr = m_markedTapeInMtr;
    }

    public BigDecimal getM_saip() {
        return m_saip;
    }

    public void setM_saip(BigDecimal m_saip) {
        this.m_saip = m_saip;
    }

    public BigDecimal getNoOfTP() {
        return noOfTP;
    }

    public void setNoOfTP(BigDecimal noOfTP) {
        this.noOfTP = noOfTP;
    }

    public BigDecimal getTran_totalNoOfMLP1() {
        return tran_totalNoOfMLP1;
    }

    public void setTran_totalNoOfMLP1(BigDecimal tran_totalNoOfMLP1) {
        this.tran_totalNoOfMLP1 = tran_totalNoOfMLP1;
    }

    public BigDecimal getTran_settingOutStores() {
        return tran_settingOutStores;
    }

    public void setTran_settingOutStores(BigDecimal tran_settingOutStores) {
        this.tran_settingOutStores = tran_settingOutStores;
    }

    public BigDecimal getNmm_ssmToTp1() {
        return nmm_ssmToTp1;
    }

    public void setNmm_ssmToTp1(BigDecimal nmm_ssmToTp1) {
        this.nmm_ssmToTp1 = nmm_ssmToTp1;
    }

    public BigDecimal getNmm_tp1ToTp2() {
        return nmm_tp1ToTp2;
    }

    public void setNmm_tp1ToTp2(BigDecimal nmm_tp1ToTp2) {
        this.nmm_tp1ToTp2 = nmm_tp1ToTp2;
    }

    public BigDecimal getNmm_tp2ToTp3() {
        return nmm_tp2ToTp3;
    }

    public void setNmm_tp2ToTp3(BigDecimal nmm_tp2ToTp3) {
        this.nmm_tp2ToTp3 = nmm_tp2ToTp3;
    }

    public BigDecimal getNmm_tp3ToTp4() {
        return nmm_tp3ToTp4;
    }

    public void setNmm_tp3ToTp4(BigDecimal nmm_tp3ToTp4) {
        this.nmm_tp3ToTp4 = nmm_tp3ToTp4;
    }

    public BigDecimal getNmm_tp4ToESM() {
        return nmm_tp4ToESM;
    }

    public void setNmm_tp4ToESM(BigDecimal nmm_tp4ToESM) {
        this.nmm_tp4ToESM = nmm_tp4ToESM;
    }

    public BigDecimal getM_ssmToTp1() {
        return m_ssmToTp1;
    }

    public void setM_ssmToTp1(BigDecimal m_ssmToTp1) {
        this.m_ssmToTp1 = m_ssmToTp1;
    }

    public BigDecimal getM_tp1ToTp2() {
        return m_tp1ToTp2;
    }

    public void setM_tp1ToTp2(BigDecimal m_tp1ToTp2) {
        this.m_tp1ToTp2 = m_tp1ToTp2;
    }

    public BigDecimal getM_tp2ToTp3() {
        return m_tp2ToTp3;
    }

    public void setM_tp2ToTp3(BigDecimal m_tp2ToTp3) {
        this.m_tp2ToTp3 = m_tp2ToTp3;
    }

    public BigDecimal getM_tp3ToTp4() {
        return m_tp3ToTp4;
    }

    public void setM_tp3ToTp4(BigDecimal m_tp3ToTp4) {
        this.m_tp3ToTp4 = m_tp3ToTp4;
    }

    public BigDecimal getM_tp4ToESM() {
        return m_tp4ToESM;
    }

    public void setM_tp4ToESM(BigDecimal m_tp4ToESM) {
        this.m_tp4ToESM = m_tp4ToESM;
    }

    public BigDecimal getAnti_Tank_mk_ssmToTp1() {
        return anti_Tank_mk_ssmToTp1;
    }

    public void setAnti_Tank_mk_ssmToTp1(BigDecimal anti_Tank_mk_ssmToTp1) {
        this.anti_Tank_mk_ssmToTp1 = anti_Tank_mk_ssmToTp1;
    }

    public BigDecimal getAnti_Tank_mk_tp1ToTp2() {
        return anti_Tank_mk_tp1ToTp2;
    }

    public void setAnti_Tank_mk_tp1ToTp2(BigDecimal anti_Tank_mk_tp1ToTp2) {
        this.anti_Tank_mk_tp1ToTp2 = anti_Tank_mk_tp1ToTp2;
    }

    public BigDecimal getAnti_Tank_mk_tp2ToTp3() {
        return anti_Tank_mk_tp2ToTp3;
    }

    public void setAnti_Tank_mk_tp2ToTp3(BigDecimal anti_Tank_mk_tp2ToTp3) {
        this.anti_Tank_mk_tp2ToTp3 = anti_Tank_mk_tp2ToTp3;
    }

    public BigDecimal getAnti_Tank_mk_tp3ToTp4() {
        return anti_Tank_mk_tp3ToTp4;
    }

    public void setAnti_Tank_mk_tp3ToTp4(BigDecimal anti_Tank_mk_tp3ToTp4) {
        this.anti_Tank_mk_tp3ToTp4 = anti_Tank_mk_tp3ToTp4;
    }

    public BigDecimal getAnti_Tank_mk_tp4ToESM() {
        return anti_Tank_mk_tp4ToESM;
    }

    public void setAnti_Tank_mk_tp4ToESM(BigDecimal anti_Tank_mk_tp4ToESM) {
        this.anti_Tank_mk_tp4ToESM = anti_Tank_mk_tp4ToESM;
    }

    public BigDecimal getTran_navigationStores() {
        return tran_navigationStores;
    }

    public void setTran_navigationStores(BigDecimal tran_navigationStores) {
        this.tran_navigationStores = tran_navigationStores;
    }

    public BigDecimal getNoOfSHooks() {
        return noOfSHooks;
    }

    public void setNoOfSHooks(BigDecimal noOfSHooks) {
        this.noOfSHooks = noOfSHooks;
    }

    public BigDecimal getNylonRopeInMtr() {
        return nylonRopeInMtr;
    }

    public void setNylonRopeInMtr(BigDecimal nylonRopeInMtr) {
        this.nylonRopeInMtr = nylonRopeInMtr;
    }

    public BigDecimal getTotalUnMarkTapeInMtrs() {
        return totalUnMarkTapeInMtrs;
    }

    public void setTotalUnMarkTapeInMtrs(BigDecimal totalUnMarkTapeInMtrs) {
        this.totalUnMarkTapeInMtrs = totalUnMarkTapeInMtrs;
    }

    public BigDecimal getSsmToTp1() {
        return ssmToTp1;
    }

    public void setSsmToTp1(BigDecimal ssmToTp1) {
        this.ssmToTp1 = ssmToTp1;
    }

    public BigDecimal getTp1ToTp2() {
        return tp1ToTp2;
    }

    public void setTp1ToTp2(BigDecimal tp1ToTp2) {
        this.tp1ToTp2 = tp1ToTp2;
    }

    public BigDecimal getTp2ToTp3() {
        return tp2ToTp3;
    }

    public void setTp2ToTp3(BigDecimal tp2ToTp3) {
        this.tp2ToTp3 = tp2ToTp3;
    }

    public BigDecimal getTp3ToTp4() {
        return tp3ToTp4;
    }

    public void setTp3ToTp4(BigDecimal tp3ToTp4) {
        this.tp3ToTp4 = tp3ToTp4;
    }

    public BigDecimal getTp4ToESM() {
        return tp4ToESM;
    }

    public void setTp4ToESM(BigDecimal tp4ToESM) {
        this.tp4ToESM = tp4ToESM;
    }

    public BigDecimal getAntiPerD() {
        return antiPerD;
    }

    public void setAntiPerD(BigDecimal antiPerD) {
        this.antiPerD = antiPerD;
    }

    public BigDecimal getAntiTankD() {
        return antiTankD;
    }

    public void setAntiTankD(BigDecimal antiTankD) {
        this.antiTankD = antiTankD;
    }

    public BigDecimal getTotalUnMarkTapeInReels() {
        return totalUnMarkTapeInReels;
    }

    public void setTotalUnMarkTapeInReels(BigDecimal totalUnMarkTapeInReels) {
        this.totalUnMarkTapeInReels = totalUnMarkTapeInReels;
    }

    public BigDecimal getUnMarkedTape1InMtr() {
        return unMarkedTape1InMtr;
    }

    public void setUnMarkedTape1InMtr(BigDecimal unMarkedTape1InMtr) {
        this.unMarkedTape1InMtr = unMarkedTape1InMtr;
    }

    public BigDecimal getMarkedTapeInMtr() {
        return markedTapeInMtr;
    }

    public void setMarkedTapeInMtr(BigDecimal markedTapeInMtr) {
        this.markedTapeInMtr = markedTapeInMtr;
    }

    public BigDecimal getBindingWireInMtrs() {
        return bindingWireInMtrs;
    }

    public void setBindingWireInMtrs(BigDecimal bindingWireInMtrs) {
        this.bindingWireInMtrs = bindingWireInMtrs;
    }

    public BigDecimal getTran_alsOnMines() {
        return tran_alsOnMines;
    }

    public void setTran_alsOnMines(BigDecimal tran_alsOnMines) {
        this.tran_alsOnMines = tran_alsOnMines;
    }


    public BigDecimal getSaip3() {
        return saip3;
    }

    public void setSaip3(BigDecimal saip3) {
        this.saip3 = saip3;
    }

    public BigDecimal getUnMarkedTape() {
        return unMarkedTape;
    }

    public void setUnMarkedTape(BigDecimal unMarkedTape) {
        this.unMarkedTape = unMarkedTape;
    }

    public BigDecimal getGuideTape() {
        return guideTape;
    }

    public void setGuideTape(BigDecimal guideTape) {
        this.guideTape = guideTape;
    }

    public BigDecimal getReturnGuideTape() {
        return returnGuideTape;
    }

    public void setReturnGuideTape(BigDecimal returnGuideTape) {
        this.returnGuideTape = returnGuideTape;
    }

    public BigDecimal getSaip1() {
        return saip1;
    }

    public void setSaip1(BigDecimal saip1) {
        this.saip1 = saip1;
    }

    public BigDecimal getNightSignBoards() {
        return nightSignBoards;
    }

    public void setNightSignBoards(BigDecimal nightSignBoards) {
        this.nightSignBoards = nightSignBoards;
    }

    public BigDecimal getAldStore() {
        return aldStore;
    }

    public void setAldStore(BigDecimal aldStore) {
        this.aldStore = aldStore;
    }

    public BigDecimal getTripFlare() {
        return tripFlare;
    }

    public void setTripFlare(BigDecimal tripFlare) {
        this.tripFlare = tripFlare;
    }

    public BigDecimal getUnMarkedTape1() {
        return unMarkedTape1;
    }

    public void setUnMarkedTape1(BigDecimal unMarkedTape1) {
        this.unMarkedTape1 = unMarkedTape1;
    }

    public BigDecimal getSaip2() {
        return saip2;
    }

    public void setSaip2(BigDecimal saip2) {
        this.saip2 = saip2;
    }

    public BigDecimal getTran_antiPeer() {
        return tran_antiPeer;
    }

    public void setTran_antiPeer(BigDecimal tran_antiPeer) {
        this.tran_antiPeer = tran_antiPeer;
    }

    public BigDecimal getTran_antiTank() {
        return tran_antiTank;
    }

    public void setTran_antiTank(BigDecimal tran_antiTank) {
        this.tran_antiTank = tran_antiTank;
    }

    public BigDecimal getTran_fragMine() {
        return tran_fragMine;
    }

    public void setTran_fragMine(BigDecimal tran_fragMine) {
        this.tran_fragMine = tran_fragMine;
    }

    public BigDecimal getTran_totalAls() {
        return tran_totalAls;
    }

    public void setTran_totalAls(BigDecimal tran_totalAls) {
        this.tran_totalAls = tran_totalAls;
    }

    public BigDecimal getTran_markingStores() {
        return tran_markingStores;
    }

    public void setTran_markingStores(BigDecimal tran_markingStores) {
        this.tran_markingStores = tran_markingStores;
    }

    public BigDecimal getTran_totalNoOfMLP() {
        return tran_totalNoOfMLP;
    }

    public void setTran_totalNoOfMLP(BigDecimal tran_totalNoOfMLP) {
        this.tran_totalNoOfMLP = tran_totalNoOfMLP;
    }

    public BigDecimal getMarkedTape() {
        return markedTape;
    }

    public void setMarkedTape(BigDecimal markedTape) {
        this.markedTape = markedTape;
    }

    public BigDecimal getTapingPin() {
        return tapingPin;
    }

    public void setTapingPin(BigDecimal tapingPin) {
        this.tapingPin = tapingPin;
    }

    public BigDecimal getSaip() {
        return saip;
    }

    public void setSaip(BigDecimal saip) {
        this.saip = saip;
    }

    public BigDecimal getPms() {
        return pms;
    }

    public void setPms(BigDecimal pms) {
        this.pms = pms;
    }

    public BigDecimal getBindingWire() {
        return bindingWire;
    }

    public void setBindingWire(BigDecimal bindingWire) {
        this.bindingWire = bindingWire;
    }

    public BigDecimal getLaip() {
        return laip;
    }

    public void setLaip(BigDecimal laip) {
        this.laip = laip;
    }

    public BigDecimal getBarbedWireBundle() {
        return barbedWireBundle;
    }

    public void setBarbedWireBundle(BigDecimal barbedWireBundle) {
        this.barbedWireBundle = barbedWireBundle;
    }

    public Integer getTotalMines() {
        return totalMines;
    }

    public void setTotalMines(Integer totalMines) {
        this.totalMines = totalMines;
    }

    public Integer getAntiPersMine() {
        return antiPersMine;
    }

    public void setAntiPersMine(Integer antiPersMine) {
        this.antiPersMine = antiPersMine;
    }

    public Integer getAntiTankMine() {
        return antiTankMine;
    }

    public void setAntiTankMine(Integer antiTankMine) {
        this.antiTankMine = antiTankMine;
    }

    public Integer getFragMine() {
        return fragMine;
    }

    public void setFragMine(Integer fragMine) {
        this.fragMine = fragMine;
    }

    public Integer getNoOfStrips() {
        return noOfStrips;
    }

    public void setNoOfStrips(Integer noOfStrips) {
        this.noOfStrips = noOfStrips;
    }

    public BigDecimal getCalAntiPerStrip() {
        return calAntiPerStrip;
    }

    public void setCalAntiPerStrip(BigDecimal calAntiPerStrip) {
        this.calAntiPerStrip = calAntiPerStrip;
    }

    public BigDecimal getCalAntiTankStrip() {
        return calAntiTankStrip;
    }

    public void setCalAntiTankStrip(BigDecimal calAntiTankStrip) {
        this.calAntiTankStrip = calAntiTankStrip;
    }

    public BigDecimal getCalFragStrip() {
        return calFragStrip;
    }

    public void setCalFragStrip(BigDecimal calFragStrip) {
        this.calFragStrip = calFragStrip;
    }


    public BigDecimal getFrontage() {
        return frontage;
    }

    public void setFrontage(BigDecimal frontage) {
        this.frontage = frontage;
    }

    public BigDecimal getDept() {
        return dept;
    }

    public void setDept(BigDecimal dept) {
        this.dept = dept;
    }

    public BigDecimal getAntiPerStrip() {
        return antiPerStrip;
    }

    public void setAntiPerStrip(BigDecimal antiPerStrip) {
        this.antiPerStrip = antiPerStrip;
    }

    public BigDecimal getAntiTankStrip() {
        return antiTankStrip;
    }

    public void setAntiTankStrip(BigDecimal antiTankStrip) {
        this.antiTankStrip = antiTankStrip;
    }

    public String getFragStrip() {
        return fragStrip;
    }

    public void setFragStrip(String fragStrip) {
        this.fragStrip = fragStrip;
    }

    public BigDecimal getVsl() {
        return vsl;
    }

    public void setVsl(BigDecimal vsl) {
        this.vsl = vsl;
    }

    public BigDecimal getIsl() {
        return isl;
    }

    public void setIsl(BigDecimal isl) {
        this.isl = isl;
    }
}
