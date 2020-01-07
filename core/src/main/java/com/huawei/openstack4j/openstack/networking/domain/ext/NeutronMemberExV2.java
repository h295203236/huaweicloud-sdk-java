package com.huawei.openstack4j.openstack.networking.domain.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.network.ext.MemberExV2;
import com.huawei.openstack4j.model.network.ext.builder.MemberExV2Builder;
import com.huawei.openstack4j.openstack.common.ListResult;
import com.google.common.base.MoreObjects;

import java.util.List;

/**
 * A member of a v2 lbaas pool
 * @author emjburns
 */
@JsonRootName("member")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeutronMemberExV2 implements MemberExV2 {
    private String id;

    @JsonProperty("tenant_id")
    private String tenantId;

    private String address;

    private String name;

    @JsonProperty("device_id")
    private String deviceId;

    @JsonProperty("operating_status")
    private String operationStatus;

    @JsonProperty("protocol_port")
    private Integer protocolPort;

    /**
     * 1~100
     */
    private Integer weight;

    @JsonProperty("subnet_id")
    private String subnetId;

    @JsonProperty("admin_state_up")
    private boolean adminStateUp = true;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAdminStateUp(){
        return adminStateUp;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSubnetId(){
        return subnetId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getWeight(){
        return weight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getProtocolPort(){
        return protocolPort;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAddress(){
        return address;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTenantId(){
        return tenantId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId(){
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName(){
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDeviceId(){
        return deviceId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getOperationStatus(){
        return operationStatus;
    }

    @Override
    public String toString(){
        return MoreObjects.toStringHelper(this)
                          .add("id", id)
                          .add("tenantId", tenantId)
                          .add("address", address)
                          .add("name", name)
                          .add("protocolPort", protocolPort)
                          .add("adminStateUp", adminStateUp)
                          .add("weight",weight)
                          .add("subnetId",subnetId)
                          .add("name",subnetId)
                          .add("subnetId",subnetId)
                          .add("subnetId",subnetId)
                          .add("name",name)
                          .add("deviceId",deviceId)
                          .add("opertaionStatus",operationStatus)
                          .toString();
    }

    public static class MembersExV2 extends ListResult<NeutronMemberExV2> {
        /**
         *
         */
        private static final long serialVersionUID = 1L;
        @JsonProperty("members")
        List<NeutronMemberExV2> members;

        /**
         * {@inheritDoc}
         */
        @Override
        protected List<NeutronMemberExV2> value() {
            return members;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                              .add("members", members)
                              .toString();
        }
    }

    /**
     * MemberV2 create builder
     */
    public static class MemberExV2ConcreteBuilder implements MemberExV2Builder {
        private NeutronMemberExV2 m;

        public MemberExV2ConcreteBuilder() {
            this(new NeutronMemberExV2());
        }

        public MemberExV2ConcreteBuilder(NeutronMemberExV2 m) {
            this.m = m;
        }

        @Override
        public MemberExV2 build(){
            return m;
        }

        @Override
        public MemberExV2Builder from(MemberExV2 in){
            m = (NeutronMemberExV2) in;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberExV2Builder tenantId(String tenantId){
            m.tenantId = tenantId;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberExV2Builder address(String address){
            m.address = address;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberExV2Builder protocolPort(Integer protocolPort){
            m.protocolPort = protocolPort;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberExV2Builder subnetId(String subnetId){
            m.subnetId = subnetId;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberExV2Builder weight(Integer weight){
            m.weight = weight;
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public MemberExV2Builder adminStateUp(boolean adminStateUp){
            m.adminStateUp = adminStateUp;
            return this;
        }

        @Override
        public MemberExV2Builder name(String name) {
            m.name = name;
            return this;
        }

        @Override
        public MemberExV2Builder deviceId(String deviceId) {
            m.deviceId = deviceId;
            return this;
        }

        @Override
        public MemberExV2Builder operationStatus(String operationStatus) {
            m.operationStatus = operationStatus;
            return this;
        }
    }

    @Override
    public MemberExV2Builder toBuilder(){
        return new NeutronMemberExV2.MemberExV2ConcreteBuilder(this);
    }

    public static MemberExV2Builder builder(){
        return new NeutronMemberExV2.MemberExV2ConcreteBuilder();
    }

}
