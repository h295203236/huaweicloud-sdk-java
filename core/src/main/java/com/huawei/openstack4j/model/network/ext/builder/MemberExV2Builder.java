package com.huawei.openstack4j.model.network.ext.builder;

import com.huawei.openstack4j.common.Buildable;
import com.huawei.openstack4j.model.network.ext.MemberExV2;

public interface MemberExV2Builder extends Buildable.Builder<MemberExV2Builder, MemberExV2> {
    /**
     * @param tenantId
     *            Owner of the member. Only an administrative user can specify a
     *            tenant ID other than its own.
     * @return MemberExV2Builder
     */
    MemberExV2Builder tenantId(String tenantId);

    /**
     *
     * @param address
     *            The IP address of the member.
     * @return MemberExV2Builder
     */
    MemberExV2Builder address(String address);

    /**
     *
     * @param name
     *            The IP address of the member.
     * @return MemberExV2Builder
     */
    MemberExV2Builder name(String name);

    /**
     * @param protocolPort
     *            The port on which the application is hosted. A valid value
     *            is from 1 to 65535
     * @return MemberExV2Builder
     */
    MemberExV2Builder protocolPort(Integer protocolPort);

    /**
     * @param subnetId
     *            The subnet in which to access the member
     * @return MemberExV2Builder
     */
    MemberExV2Builder subnetId(String subnetId);

    /**
     * Optional
     *
     * @param weight
     *           Weight of member.from 1 to 256
     *           Default 1
     * @return MemberExV2Builder
     */
    MemberExV2Builder weight(Integer weight);


    /**
     * Optional
     *
     * @param adminStateUp
     *            The administrative state of the member, which is up (true) or
     *            down (false). Default true.
     * @return MemberExV2Builder
     */
    MemberExV2Builder adminStateUp(boolean adminStateUp);


    /**
     * Optional
     *
     * @param deviceId
     *            The device id.
     * @return MemberExV2Builder
     */
    MemberExV2Builder deviceId(String deviceId);


    /**
     * Optional
     *
     * @param operationStatus
     *            The operation status of healthmonitor.
     * @return MemberExV2Builder
     */
    MemberExV2Builder operationStatus(String operationStatus);
}
