/*
 * Copyright 2016 Code Above Lab LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeabovelab.dm.common.security.dto;

import org.springframework.security.acls.model.ObjectIdentity;
import org.springframework.security.acls.model.Sid;

import java.io.Serializable;
import java.util.List;

/**
 * common ACL DTO iface <p/>
 * TODO add version info for CAS-like resolving of concurrent  modification problem <p/>
 */
public interface AclData extends Serializable {
    Long getId();
    List<AceData> getEntries();
    ObjectIdentity getObjectIdentity();
    Sid getOwner();
    AclData getParentAclData();
    boolean isEntriesInheriting();

}
