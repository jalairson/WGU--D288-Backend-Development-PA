package com.jerry.javad288.Entities;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class StatusType {

    CartStatus cartStatus;
    public enum CartStatus{

        pending, ordered, canceled

    }

    public StatusType(CartStatus cartStatus) {

        this.cartStatus = cartStatus;

    }

}

