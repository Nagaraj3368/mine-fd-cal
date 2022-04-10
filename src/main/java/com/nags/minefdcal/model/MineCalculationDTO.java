package com.nags.minefdcal.model;

import java.math.BigDecimal;


public class MineCalculationDTO {


    private BigDecimal frontage = BigDecimal.ZERO;

    private BigDecimal dept = BigDecimal.ZERO;

    private BigDecimal antiPerStrip = BigDecimal.ZERO;

    private BigDecimal calAntiPerStrip = BigDecimal.ZERO;

    private BigDecimal antiTankStrip = BigDecimal.ZERO;

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

    private BigDecimal tapingPin = BigDecimal.ZERO;

    private BigDecimal saip = BigDecimal.ZERO;


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
    private BigDecimal tran_totalAls = BigDecimal.ZERO;
    private BigDecimal tran_markingStores = BigDecimal.ZERO;
    private BigDecimal tran_settingOutStores = BigDecimal.ZERO;
    private BigDecimal tran_navigationStores = BigDecimal.ZERO;
    private BigDecimal tran_totalNoOfMLP = BigDecimal.ZERO;
    private BigDecimal tran_totalNoOfMLP1 = BigDecimal.ZERO;

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
