package com.huawei.openstack4j.model.network.ext;

import com.huawei.openstack4j.common.Buildable;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.model.network.ext.builder.MemberExV2Builder;

/**
 * A member of a Lbaas V2 pool
 * @author emjburns
 */
public interface MemberExV2 extends ModelEntity, Buildable<MemberExV2Builder> {
    /**
     * @return the member identifier
     */
    String getId();

    /**
     * @return the id of a tenant. Owner of the member.
     */
    String getTenantId();

    /**
     * @return address the IP address of a member
     */
    String getAddress();

    /**
     * @return The port on which the application is hosted.such as 80
     */
    Integer getProtocolPort();

    /**
     * @return Weight of member.1~256
     */
    Integer getWeight();

    /**
     * @return The subnet in which to access the member
     */
    String getSubnetId();

    /**
     * @return The administrative state of the member, which is up (true) or
     *         down (false).
     */
    boolean isAdminStateUp();

    /**
     * @return The administrative state of the member, which is up (true) or
     *         down (false).
     */
    String getName();

    /**
     * @return The administrative state of the member, which is up (true) or
     *         down (false).
     */
    String getDeviceId();

    /**
     * @return The administrative state of the member, which is up (true) or
     *         down (false).
     */
    String getOperationStatus();
}
