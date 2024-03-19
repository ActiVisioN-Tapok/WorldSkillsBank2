package com.example.worldskillsbank;

public class ListData1 {
    private int flagID;
    private int nameID;
    private int abbreviationID;
    private int sellID;
    private int buyID;

    public ListData1 (int _flagID, int _nameID, int _abbreviationID, int _sellID, int _buyID){
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
        sellID = _sellID;
        buyID = _buyID;
    }

    public int getFlagID(){
        return flagID;
    }

    public int getNameID(){
        return nameID;
    }

    public int getAbbreviationID() {
        return abbreviationID;
    }

    public int getSellID(){
        return sellID;
    }
    public int getBuyID(){
        return buyID;
    }
}
