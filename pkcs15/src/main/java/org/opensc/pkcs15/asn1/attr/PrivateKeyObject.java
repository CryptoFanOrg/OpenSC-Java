/***********************************************************
 * $Id$
 * 
 * PKCS#15 cryptographic provider of the opensc project.
 * http://www.opensc-project.org
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
 *
 * Created: 06.01.2008
 * 
 ***********************************************************/

package org.opensc.pkcs15.asn1.attr;

import java.security.PrivateKey;

import org.bouncycastle.asn1.DEREncodable;
import org.opensc.pkcs15.asn1.proxy.ReferenceProxy;

/**
 * This interface is extended by all interfaces, which represent
 * a private key stored on a token. Please note, that most of the
 * time a <code>ReferencedValue{PrivateKeyObject}</code> is stored on the
 * card, so instances of this interface implement
 * {@link ReferenceProxy} too in this case.
 * 
 * @author wglas
 */
public interface PrivateKeyObject extends DEREncodable, PrivateKey {
}
