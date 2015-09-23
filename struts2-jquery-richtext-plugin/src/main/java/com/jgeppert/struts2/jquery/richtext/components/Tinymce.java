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

package com.jgeppert.struts2.jquery.richtext.components;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

import com.jgeppert.struts2.jquery.components.Textarea;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * <!-- START SNIPPET: javadoc -->
 * <p>
 * Render a Richtext Element based on Tinymce
 * </p>
 * <!-- END SNIPPET: javadoc -->
 * 
 * @author <a href="http://www.jgeppert.com">Johannes Geppert</a>
 * 
 */
@StrutsTag(name = "tinymce", tldTagClass = "com.jgeppert.struts2.jquery.richtext.views.jsp.ui.TinymceTag", description = "A Richtext Element based on Tinymce", allowDynamicAttributes = true)
public class Tinymce extends Textarea {

	public static final String TEMPLATE = "tinymce";
	public static final String TEMPLATE_CLOSE = "tinymce-close";
	public static final String COMPONENT_NAME = Tinymce.class.getName();
	final private static transient Random RANDOM = new Random();
	public static final String JQUERYACTION = "tinymce";

	protected String cols;
	protected String readonly;
	protected String rows;
	protected String wrap;
	protected String width;
	protected String height;
	protected String editorLocal;
	protected String editorTheme;
	protected String editorSkin;
	protected String editorSkinVariant;
	protected String toolbarLocation;
	protected String toolbarAlign;
	protected String statusbarLocation;
	protected String plugins;
	protected String toolbarButtonsRow1;
	protected String toolbarButtonsRow2;
	protected String toolbarButtonsRow3;
	protected String toolbarButtonsRow4;
	protected String entityEncoding;
	protected String contentCss;
	protected String pastePlainText;
	protected String removeLinebreaks;
	protected String removeRedundantBrs;
	protected String onSaveTopics;
	protected String onEventTopics;

	public Tinymce(ValueStack stack, HttpServletRequest request,
			HttpServletResponse response) {
		super(stack, request, response);
	}

	public String getDefaultOpenTemplate() {
		return TEMPLATE;
	}

	protected String getDefaultTemplate() {
		return TEMPLATE_CLOSE;
	}

	public void evaluateExtraParams() {
		super.evaluateExtraParams();

		addParameter("jqueryaction", JQUERYACTION);

		if (readonly != null) {
			addParameter("readonly", findValue(readonly, Boolean.class));
		}

		if (cols != null) {
			addParameter("cols", findString(cols));
		}

		if (rows != null) {
			addParameter("rows", findString(rows));
		}

		if (wrap != null) {
			addParameter("wrap", findString(wrap));
		}

		if (height != null) {
			addParameter("height", findValue(height, Integer.class));
		}

		if (width != null) {
			addParameter("width", findValue(width, Integer.class));
		}

		if (editorLocal != null) {
			addParameter("editorLocal", findString(editorLocal));
		}

		if (editorSkin != null) {
			addParameter("editorSkin", findString(editorSkin));
		}

		if (editorSkinVariant != null) {
			addParameter("editorSkinVariant", findString(editorSkinVariant));
		}

		if (editorTheme != null) {
			addParameter("editorTheme", findString(editorTheme));
		}

		if (toolbarAlign != null) {
			addParameter("toolbarAlign", findString(toolbarAlign));
		}
		if (toolbarLocation != null) {
			addParameter("toolbarLocation", findString(toolbarLocation));
		}
		if (statusbarLocation != null) {
			addParameter("statusbarLocation", findString(statusbarLocation));
		}
		if (resizable != null) {
			addParameter("editorResizable", findValue(resizable, Boolean.class));
		}
		if (plugins != null) {
			addParameter("plugins", findString(plugins));
		}
		if (toolbarButtonsRow1 != null) {
			addParameter("toolbarButtonsRow1", findString(toolbarButtonsRow1));
		}
		if (toolbarButtonsRow2 != null) {
			addParameter("toolbarButtonsRow2", findString(toolbarButtonsRow2));
		}
		if (toolbarButtonsRow3 != null) {
			addParameter("toolbarButtonsRow3", findString(toolbarButtonsRow3));
		}
		if (toolbarButtonsRow4 != null) {
			addParameter("toolbarButtonsRow4", findString(toolbarButtonsRow4));
		}
		if (entityEncoding != null) {
			addParameter("entityEncoding", findString(entityEncoding));
		}
		if (contentCss != null) {
			addParameter("contentCss", findString(contentCss));
		}
		if (pastePlainText != null) {
			addParameter("pasteplain", findValue(pastePlainText, Boolean.class));
		}
		if (removeLinebreaks != null) {
			addParameter("removeLinebreaks",
					findValue(removeLinebreaks, Boolean.class));
		}
		if (removeRedundantBrs != null) {
			addParameter("removeRedundantBrs",
					findValue(removeRedundantBrs, Boolean.class));
		}
		if (onSaveTopics != null) {
			addParameter("onSaveTopics", findString(onSaveTopics));
		}
		if (onEventTopics != null) {
			addParameter("onEventTopics", findString(onEventTopics));
		}

		if ((this.id == null || this.id.length() == 0)) {
			// resolves Math.abs(Integer.MIN_VALUE) issue reported by FindBugs
			// http://findbugs.sourceforge.net/bugDescriptions.html#RV_ABSOLUTE_VALUE_OF_RANDOM_INT
			int nextInt = RANDOM.nextInt();
			nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math
					.abs(nextInt);
			this.id = "tinymce_" + String.valueOf(nextInt);
			addParameter("id", this.id);
		}
	}

	@Override
	@StrutsTagSkipInheritance
	public void setTheme(String theme) {
		super.setTheme(theme);
	}

	@Override
	public String getTheme() {
		return "jquery";
	}

	@StrutsTagAttribute(description = "HTML cols attribute", type = "Integer")
	public void setCols(String cols) {
		this.cols = cols;
	}

	@StrutsTagAttribute(description = "Whether the textarea is readonly", type = "Boolean", defaultValue = "false")
	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	@StrutsTagAttribute(description = "HTML rows attribute", type = "Integer")
	public void setRows(String rows) {
		this.rows = rows;
	}

	@StrutsTagAttribute(description = "HTML wrap attribute")
	public void setWrap(String wrap) {
		this.wrap = wrap;
	}

	@StrutsTagAttribute(description = "width attribute", type = "Integer")
	public void setWidth(String width) {
		this.width = width;
	}

	@StrutsTagAttribute(description = "height attribute", type = "Integer")
	public void setHeight(String height) {
		this.height = height;
	}

	@StrutsTagAttribute(description = "the editor local", defaultValue = "en")
	public void setEditorLocal(String editorLocal) {
		this.editorLocal = editorLocal;
	}

	@StrutsTagAttribute(description = "This option enables you to specify what theme to use when rendering the TinyMCE WYSIWYG editor instances. e.g simple or advanced", defaultValue = "advanced")
	public void setEditorTheme(String editorTheme) {
		this.editorTheme = editorTheme;
	}

	@StrutsTagAttribute(description = "This option enables you to specify what skin you want to use with your theme. A skin is basically a CSS file that gets loaded from the skins directory inside the theme. The advanced theme that TinyMCE comes with has two skins these are called default and o2k7.", defaultValue = "default")
	public void setEditorSkin(String editorSkin) {
		this.editorSkin = editorSkin;
	}

	@StrutsTagAttribute(description = "This option enables you to specify what skin variant you want to use with your theme. e.g. you can use editorSkin=o2k7 and editorSkinVariant=silver or editorSkinVariant=black")
	public void setEditorSkinVariant(String editorSkinVariant) {
		this.editorSkinVariant = editorSkinVariant;
	}

	@StrutsTagAttribute(description = "This option enables you to specify where the toolbar should be located. This option can be set to top or bottom or external. This option can only be used when theme is set to advanced and when the theme_advanced_layout_manager  option is set to the default value of SimpleLayout. Choosing the external location adds the toolbar to a DIV element and sets the class of this DIV to mceExternalToolbar. This enables you to freely specify the location of the toolbar.", defaultValue = "bottom")
	public void setToolbarLocation(String toolbarLocation) {
		this.toolbarLocation = toolbarLocation;
	}

	@StrutsTagAttribute(description = "This option enables you to specify the alignment of the toolbar, this value can be left, right or center. This option can only be used when theme is set to advanced and when the theme_advanced_layout_manager  option is set to the default value of SimpleLayout. ", defaultValue = "center")
	public void setToolbarAlign(String toolbarAlign) {
		this.toolbarAlign = toolbarAlign;
	}

	@StrutsTagAttribute(description = "This option enables you to specify where the element statusbar with the path and resize tool should be located. This option can be set to top, bottom or none. The default value is set to bottom.", defaultValue = "bottom")
	public void setStatusbarLocation(String statusbarLocation) {
		this.statusbarLocation = statusbarLocation;
	}

	@StrutsTagAttribute(description = "This option gives you the ability to enable/disable the resizing button.", defaultValue = "false", type = "Boolean")
	public void setResizable(String resizable) {
		this.resizable = resizable;
	}

	@StrutsTagAttribute(description = "This option should contain a comma separated list of plugins. TinyMCE is shipped with some core plugins; these are described in greater detail in the Plugins reference. http://wiki.moxiecode.com/index.php/TinyMCE:Plugins e.g. table,contextmenu,paste", defaultValue = "")
	public void setPlugins(String plugins) {
		this.plugins = plugins;
	}

	@StrutsTagAttribute(description = "This option should contain a comma separated list of button/control names to insert into the toolbar. his option can only be used when theme is set to advanced. Since these rows have items in them by default you need to set them to SPACE \' \' if you want to completely remove rows. A complete reference of all built in buttons and controls can be found in the button/control reference page. http://wiki.moxiecode.com/index.php/TinyMCE:Control_reference e.g. separator,insertdate,inserttime,preview,zoom,separator,forecolor,backcolor", defaultValue = "")
	public void setToolbarButtonsRow1(String toolbarButtonsRow1) {
		this.toolbarButtonsRow1 = toolbarButtonsRow1;
	}

	@StrutsTagAttribute(description = "This option should contain a comma separated list of button/control names to insert into the toolbar. his option can only be used when theme is set to advanced. Since these rows have items in them by default you need to set them to SPACE \' \' if you want to completely remove rows. A complete reference of all built in buttons and controls can be found in the button/control reference page. http://wiki.moxiecode.com/index.php/TinyMCE:Control_reference e.g. bullist,numlist,separator,outdent,indent,separator,undo,redo,separator", defaultValue = "")
	public void setToolbarButtonsRow2(String toolbarButtonsRow2) {
		this.toolbarButtonsRow2 = toolbarButtonsRow2;
	}

	@StrutsTagAttribute(description = "This option should contain a comma separated list of button/control names to insert into the toolbar. his option can only be used when theme is set to advanced. Since these rows have items in them by default you need to set them to SPACE \' \' if you want to completely remove rows. A complete reference of all built in buttons and controls can be found in the button/control reference page. http://wiki.moxiecode.com/index.php/TinyMCE:Control_reference e.g. hr,removeformat,visualaid,separator,sub,sup,separator,charmap", defaultValue = "")
	public void setToolbarButtonsRow3(String toolbarButtonsRow3) {
		this.toolbarButtonsRow3 = toolbarButtonsRow3;
	}

	@StrutsTagAttribute(description = "This option should contain a comma separated list of button/control names to insert into the toolbar. his option can only be used when theme is set to advanced. Since these rows have items in them by default you need to set them to SPACE \' \' if you want to completely remove rows. A complete reference of all built in buttons and controls can be found in the button/control reference page. http://wiki.moxiecode.com/index.php/TinyMCE:Control_reference e.g. emotions,fullpage,fullscreen", defaultValue = "")
	public void setToolbarButtonsRow4(String toolbarButtonsRow4) {
		this.toolbarButtonsRow4 = toolbarButtonsRow4;
	}

	@StrutsTagAttribute(description = "This option controls how entities/characters get processed by TinyMCE. http://wiki.moxiecode.com/index.php/TinyMCE:Configuration/entity_encoding e.g. named or numeric or raw", defaultValue = "")
	public void setEntityEncoding(String entityEncoding) {
		this.entityEncoding = entityEncoding;
	}

	@StrutsTagAttribute(description = "This option enables you to specify a custom CSS file that extends the theme content CSS. This CSS file is the one used within the editor (the editable area). This option can also be a comma separated list of URLs. e.g. css/custom_content.css", defaultValue = "")
	public void setContentCss(String contentCss) {
		this.contentCss = contentCss;
	}

	@StrutsTagAttribute(description = "Always paste as plaintext.‎", type = "Boolean", defaultValue = "false")
	public void setPastePlainText(String pastePlainText) {
		this.pastePlainText = pastePlainText;
	}

	@StrutsTagAttribute(description = "This option controls whether line break characters should be removed from output HTML.‎", type = "Boolean", defaultValue = "true")
	public void setRemoveLinebreaks(String removeLinebreaks) {
		this.removeLinebreaks = removeLinebreaks;
	}

	@StrutsTagAttribute(description = "This option is enabled by default and will control the output of trailing BR elements at the end of block elements.‎", type = "Boolean", defaultValue = "true")
	public void setRemoveRedundantBrs(String removeRedundantBrs) {
		this.removeRedundantBrs = removeRedundantBrs;
	}

	@StrutsTagAttribute(description = "Topics that are published when user press the save button", type = "String", defaultValue = "")
	public void setOnSaveTopics(String onSaveTopics) {
		this.onSaveTopics = onSaveTopics;
	}

	@StrutsTagAttribute(description = "Topics that are published on event such as keydown, mousedown and so forth", type = "String", defaultValue = "")
	public void setOnEventTopics(String onEventTopics) {
		this.onEventTopics = onEventTopics;
	}
}
