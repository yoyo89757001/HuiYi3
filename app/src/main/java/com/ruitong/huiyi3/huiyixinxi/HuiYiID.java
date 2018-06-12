package com.ruitong.huiyi3.huiyixinxi;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/6/12.
 */
@Entity
public class HuiYiID {

        @NotNull@Id
        private Long id;
        private String subConferenceCode;
        @Generated(hash = 2013416143)
        public HuiYiID(@NotNull Long id, String subConferenceCode) {
            this.id = id;
            this.subConferenceCode = subConferenceCode;
        }
        @Generated(hash = 1166177203)
        public HuiYiID() {
        }
        public Long getId() {
            return this.id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getSubConferenceCode() {
            return this.subConferenceCode;
        }
        public void setSubConferenceCode(String subConferenceCode) {
            this.subConferenceCode = subConferenceCode;
        }


}
