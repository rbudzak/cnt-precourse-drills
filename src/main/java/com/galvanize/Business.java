package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rickbudzak on 2/3/17.
 */
public class Business implements Addressable{
    private final String name;
    private final ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
        addresses = new ArrayList<Address>();
    }

    public String getName(){
        return this.name;
    }

    @Override
    public List<Address> getAddresses(){
        return addresses;
    }

    @Override
    public void addAddress(Address addy){
        addresses.add(addy);
    }
}

