/**
 * ***************************************************************
 * <p/>
 * Copyright 2015 Samsung Electronics All Rights Reserved.
 * <p/>
 * <p/>
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * ****************************************************************
 */

package org.iotivity.service.easysetup.mediator;

public class IpOnBoardingConnection implements OnBoardingConnection {

    private boolean mIsConnected;
    private String mIp;
    private String mHardwareAddress;
    private String mDeviceName;

    /**
     * @mThrottlingDelay
     * After creating the Soft AP at Mediator & on-boarding the-
     * -Enrollee device on it provisioning needs to be delayed by at least 2000 ms for Android Mediator
     */
    private int mThrottlingDelay = 2000 ;

    int getThrottlingDelay() {
        return mThrottlingDelay;
    }

    IpOnBoardingConnection(boolean enrolleeOnboarded) {
        mThrottlingDelay = 0;
        mIp = "0.0.0.01";
        mIsConnected = enrolleeOnboarded; // Always true for this constructor
    }

    IpOnBoardingConnection(){}

    public void setHardwareAddress(String address) {
        mHardwareAddress = address;
    }

    public String getHardwareAddress() {
        return mHardwareAddress;
    }

    public void setDeviceName(String name) {
        mDeviceName = name;
    }

    public String getDeviceName() {
        return mDeviceName;
    }

    public void setConnectivity(boolean connected) {
        mIsConnected = connected;
    }

    public void setIp(String ip) {
        mIp = ip;
    }

    public String getIp() {
        return mIp;
    }

    @Override
    public String getDesc() {
        return "Description";
    }

    @Override
    public boolean isConnected() {
        return mIsConnected;
    }

    @Override
    public Object getConnection() {
        return this;
    }

}
