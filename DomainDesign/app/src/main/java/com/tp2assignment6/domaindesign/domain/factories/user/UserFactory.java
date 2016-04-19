package com.tp2assignment6.domaindesign.domain.factories.user;

import com.tp2assignment6.domaindesign.domain.domain.user.User;

import java.util.Date;

/**
 * Created by NXA-C.unltd on 2016/04/18.
 */
public class UserFactory {
    public static User getUser(String firstname, String lastname, Date date, String mail){
        return new User.Builder()
                .firstName(firstname)
                .lastName(lastname)
                .dob(date)
                .email(mail)
                .build();
    }
}
