package com.m.health.util;

/**  
 * <p>Title: </p>  
 *  
 * <p>Description: 缓存DTO</p>  
 *  
 * <p>Copyright: Copyright (c) 2008</p>  
 *  
 * <p>Company: </p>  
 *  
 * @author Deepblue  2008-11-11  
 * @version 1.0  
 */  
public class Cache {   
        private String key;//缓存ID   
        private Object value;//缓存数据   
        private long timeOut;//更新时间   
        private boolean expired; //是否终止   
        public Cache() {   
                super();   
        }   
  
        public Cache(String key, Object value, long timeOut, boolean expired) {   
                this.key = key;   
                this.value = value;   
                this.timeOut = timeOut;   
                this.expired = expired;   
        }   
  
        public String getKey() {   
                return key;   
        }   
  
        public long getTimeOut() {   
                return timeOut;   
        }   
  
        public Object getValue() {   
                return value;   
        }   
  
        public void setKey(String string) {   
                key = string;   
        }   
  
        public void setTimeOut(long l) {   
                timeOut = l;   
        }   
  
        public void setValue(Object object) {   
                value = object;   
        }   
  
        public boolean isExpired() {   
                return expired;   
        }   
  
        public void setExpired(boolean b) {   
                expired = b;   
        }   
}    