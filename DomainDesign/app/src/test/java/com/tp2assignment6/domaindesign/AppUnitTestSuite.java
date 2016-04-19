package com.tp2assignment6.domaindesign;

import com.tp2assignment6.domaindesign.factories.booking.PaymentFactoryTest;
import com.tp2assignment6.domaindesign.factories.booking.ReservationFactoryTest;
import com.tp2assignment6.domaindesign.factories.booking.SiteFactoryTest;
import com.tp2assignment6.domaindesign.factories.booking.SystemFactoryTest;
import com.tp2assignment6.domaindesign.factories.employee.BusinessAdminFactoryTest;
import com.tp2assignment6.domaindesign.factories.employee.ChauffeurFactoryTest;
import com.tp2assignment6.domaindesign.factories.employee.EmployeeAddressFactoryTest;
import com.tp2assignment6.domaindesign.factories.employee.EmployeeContactFactoryTest;
import com.tp2assignment6.domaindesign.factories.employee.SiteMangerFactoryTest;
import com.tp2assignment6.domaindesign.factories.user.UserContactFactoryTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by NXA-C.unltd on 2016/04/19.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PaymentFactoryTest.class,
        ReservationFactoryTest.class,
        SiteFactoryTest.class,
        SystemFactoryTest.class,
        BusinessAdminFactoryTest.class,
        ChauffeurFactoryTest.class,
        EmployeeAddressFactoryTest.class,
        EmployeeContactFactoryTest.class,
        SiteMangerFactoryTest.class,
        UserContactFactoryTest.class})
public class AppUnitTestSuite {}
