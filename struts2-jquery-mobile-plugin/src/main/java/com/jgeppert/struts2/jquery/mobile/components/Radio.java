/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jgeppert.struts2.jquery.mobile.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * <p>
 * A tag that creates an Radiobutton Group from a given List.
 * </p>
 * <!-- END SNIPPET: javadoc -->
 * <p>
 * Examples
 * </p>
 * 
 * <!-- START SNIPPET: example1 -->
 * 
 * <pre>
 * &lt;sjm:radio
 * 	id=&quot;radio1&quot;
 * 	name=&quot;radio1&quot;
 * 	label=&quot;Friends&quot;
 * 	list=&quot;{'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}&quot;
 * /&gt;
 * 
 * </pre>
 * 
 * <!-- END SNIPPET: example1 -->
 * 
 * @author <a href="http://www.jgeppert.com">Johannes Geppert</a>
 * 
 */

@StrutsTag(name = "radio", tldTagClass = "com.jgeppert.struts2.jquery.mobile.views.jsp.ui.RadioTag", description = "Renders a radio button group", allowDynamicAttributes = true)
public class Radio extends org.apache.struts2.components.CheckboxList implements
	ThemeableBean {

    public static final String TEMPLATE = "radio";
    public static final String COMPONENT_NAME = Radio.class.getName();

    protected String dataTheme;
    protected String horizontal;

    public Radio(ValueStack stack, HttpServletRequest request,
	    HttpServletResponse response) {
	super(stack, request, response);
    }

    protected String getDefaultTemplate() {
	return TEMPLATE;
    }

    public void evaluateExtraParams() {
	super.evaluateExtraParams();

	if (dataTheme != null)
	    addParameter("dataTheme", findString(dataTheme));
	if (this.horizontal != null)
	    addParameter("horizontal",
		    findValue(this.horizontal, Boolean.class));
    }

    @Override
    @StrutsTagSkipInheritance
    public void setTheme(String theme) {
	super.setTheme(theme);
    }

    @Override
    public String getTheme() {
	return "mobile";
    }

    @StrutsTagAttribute(description = "make a horizontal button set", defaultValue = "false", type = "Boolean")
    public void setHorizontal(String horizontal) {
	this.horizontal = horizontal;
    }

    @StrutsTagAttribute(description = "Set the Radio Button theme. e.g. a,b,c,d or e")
    public void setDataTheme(String dataTheme) {
	this.dataTheme = dataTheme;
    }

}
