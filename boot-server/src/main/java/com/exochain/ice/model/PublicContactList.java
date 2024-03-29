package com.exochain.ice;

import java.util.HashMap;

import com.exochain.ice.IContactList;
import com.exochain.ice.Contact;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PublicContactList extends IContactList {
    public Contact you = new Contact();
    public Contact primary = new Contact();
    public Contact alternative = new Contact();
    public Contact contingency = new Contact();
    public Contact emergency = new Contact();
    public PublicContactList() {
        // Nothing to do: all contacts already initilized inline
    }
    public PublicContactList(HashMap<String, String> formData) {
        you         = new Contact("you", formData);
        primary     = new Contact("primary", formData);
        alternative = new Contact("alternative", formData);
        contingency = new Contact("contingency", formData);
        emergency   = new Contact("emergency", formData);
    }
    public void initialize() {
        you.initialize(true);
        primary.initialize();
        alternative.initialize();
        contingency.initialize();
        emergency.initialize();
    }
}

