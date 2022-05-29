package com.example.spring.injectingCollection.example1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public interface Account {
}


@Component
@Order(1)
@Qualifier("basicAccount")
class SavingAccount implements Account {
    @Override
    public String toString() {
        return "SavingAccount";
    }
}

@Component
@Order(3)
@Qualifier("basicAccount")
class CheckingAccount implements Account {
    @Override
    public String toString() {
        return "CheckInAccount";
    }
}

@Component
@Order(2)
class FixedDepositAccount implements Account {
    @Override
    public String toString() {
        return "FixedDepositAccount";
    }
}
