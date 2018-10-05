/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.spring.process;

import org.activiti.bpmn.model.FlowElement;
import org.activiti.bpmn.model.Process;
import org.activiti.engine.impl.util.ProcessInstanceHelper;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.HashMap;
import java.util.Map;

public class ProcessVariablesInitiator extends ProcessInstanceHelper {

    @Override
    public ProcessInstance createAndStartProcessInstanceWithInitialFlowElement(ProcessDefinition processDefinition, String businessKey, String processInstanceName, FlowElement initialFlowElement, Process process, Map<String, Object> variables, Map<String, Object> transientVariables, boolean startProcessInstance) {
        Map<String, Object> newVarsMap = new HashMap<>(variables);
        // TODO do actual mapping
        newVarsMap.put("customVar", "customDefaultValue");
        return super.createAndStartProcessInstanceWithInitialFlowElement(processDefinition, businessKey, processInstanceName, initialFlowElement, process, newVarsMap, transientVariables, startProcessInstance);
    }
}
