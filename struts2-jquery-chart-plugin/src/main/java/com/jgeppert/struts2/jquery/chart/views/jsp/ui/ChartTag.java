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

package com.jgeppert.struts2.jquery.chart.views.jsp.ui;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;

import com.jgeppert.struts2.jquery.chart.components.Chart;
import com.jgeppert.struts2.jquery.views.jsp.ui.AbstractContainerTag;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 
 * @author <a href="http://www.jgeppert.com">Johannes Geppert</a>
 * 
 */

public class ChartTag extends AbstractContainerTag {

	private static final long serialVersionUID = -1079998891457416433L;

	protected String xaxisPosition;
	protected String xaxisMode;
	protected String xaxisColor;
	protected String xaxisTick;
	protected String xaxisTickSize;
	protected String xaxisTickDecimals;
	protected String xaxisTickColor;
	protected String xaxisMin;
	protected String xaxisMax;
	protected String xaxisTimeformat;
	protected String xaxisLabel;
	protected String xaxisLabelFontSizePixels;
	protected String xaxisLabelFontFamily;
	protected String yaxisPosition;
	protected String yaxisMode;
	protected String yaxisColor;
	protected String yaxisTick;
	protected String yaxisTickSize;
	protected String yaxisTickDecimals;
	protected String yaxisTickColor;
	protected String yaxisMin;
	protected String yaxisMax;
	protected String yaxisTimeformat;
	protected String yaxisLabel;
	protected String yaxisLabelFontSizePixels;
	protected String yaxisLabelFontFamily;
	protected String legendShow;
	protected String legendPosition;
	protected String legendLabelBoxBorderColor;
	protected String legendBackgroundColor;
	protected String onClickTopics;
	protected String onHoverTopics;
	protected String crosshair;
	protected String crosshairMode;
	protected String crosshairColor;
	protected String crosshairLineWidth;
	protected String pie;
	protected String pieRadius;
	protected String pieInnerRadius;
	protected String pieLabel;
	protected String pieLabelFormatter;
	protected String pieLabelRadius;
	protected String pieLabelBackgroundColor;
	protected String pieLabelBackgroundOpacity;
	protected String autoResize;

	public Component getBean(ValueStack stack, HttpServletRequest req,
			HttpServletResponse res) {
		return new Chart(stack, req, res);
	}

	protected void populateParams() {
		super.populateParams();

		Chart chart = (Chart) component;
		chart.setXaxisColor(xaxisColor);
		chart.setXaxisMax(xaxisMax);
		chart.setXaxisMin(xaxisMin);
		chart.setXaxisMode(xaxisMode);
		chart.setXaxisPosition(xaxisPosition);
		chart.setXaxisTick(xaxisTick);
		chart.setXaxisTickSize(xaxisTickSize);
		chart.setXaxisTickDecimals(xaxisTickDecimals);
		chart.setXaxisTickColor(xaxisTickColor);
		chart.setXaxisTimeformat(xaxisTimeformat);
		chart.setXaxisLabel(xaxisLabel);
		chart.setXaxisLabelFontFamily(xaxisLabelFontFamily);
		chart.setXaxisLabelFontSizePixels(xaxisLabelFontSizePixels);
		chart.setYaxisColor(yaxisColor);
		chart.setYaxisMax(yaxisMax);
		chart.setYaxisMin(yaxisMin);
		chart.setYaxisMode(yaxisMode);
		chart.setYaxisPosition(yaxisPosition);
		chart.setYaxisTick(yaxisTick);
		chart.setYaxisTickSize(yaxisTickSize);
		chart.setYaxisTickDecimals(yaxisTickDecimals);
		chart.setYaxisTickColor(yaxisTickColor);
		chart.setYaxisTimeformat(yaxisTimeformat);
		chart.setYaxisLabel(yaxisLabel);
		chart.setYaxisLabelFontFamily(yaxisLabelFontFamily);
		chart.setYaxisLabelFontSizePixels(yaxisLabelFontSizePixels);
		chart.setLegendShow(legendShow);
		chart.setLegendPosition(legendPosition);
		chart.setLegendBackgroundColor(legendBackgroundColor);
		chart.setLegendLabelBoxBorderColor(legendLabelBoxBorderColor);
		chart.setOnClickTopics(onClickTopics);
		chart.setOnHoverTopics(onHoverTopics);
		chart.setCrosshair(crosshair);
		chart.setCrosshairMode(crosshairMode);
		chart.setCrosshairColor(crosshairColor);
		chart.setCrosshairLineWidth(crosshairLineWidth);
		chart.setPie(pie);
		chart.setPieRadius(pieRadius);
		chart.setPieInnerRadius(pieInnerRadius);
		chart.setPieLabel(pieLabel);
		chart.setPieLabelBackgroundColor(pieLabelBackgroundColor);
		chart.setPieLabelBackgroundOpacity(pieLabelBackgroundOpacity);
		chart.setPieLabelFormatter(pieLabelFormatter);
		chart.setPieLabelRadius(pieLabelRadius);
		chart.setAutoResize(autoResize);
	}

	public void setXaxisPosition(String xaxisPosition) {
		this.xaxisPosition = xaxisPosition;
	}

	public void setXaxisMode(String xaxisMode) {
		this.xaxisMode = xaxisMode;
	}

	public void setXaxisColor(String xaxisColor) {
		this.xaxisColor = xaxisColor;
	}

	public void setXaxisTickColor(String xaxisTickColor) {
		this.xaxisTickColor = xaxisTickColor;
	}

	public void setXaxisMin(String xaxisMin) {
		this.xaxisMin = xaxisMin;
	}

	public void setXaxisMax(String xaxisMax) {
		this.xaxisMax = xaxisMax;
	}

	public void setYaxisTimeformat(String yaxisTimeformat) {
		this.yaxisTimeformat = yaxisTimeformat;
	}

	public void setYaxisPosition(String yaxisPosition) {
		this.yaxisPosition = yaxisPosition;
	}

	public void setYaxisMode(String yaxisMode) {
		this.yaxisMode = yaxisMode;
	}

	public void setYaxisColor(String yaxisColor) {
		this.yaxisColor = yaxisColor;
	}

	public void setYaxisTickColor(String yaxisTickColor) {
		this.yaxisTickColor = yaxisTickColor;
	}

	public void setYaxisMin(String yaxisMin) {
		this.yaxisMin = yaxisMin;
	}

	public void setYaxisMax(String yaxisMax) {
		this.yaxisMax = yaxisMax;
	}

	public void setXaxisTimeformat(String xaxisTimeformat) {
		this.xaxisTimeformat = xaxisTimeformat;
	}

	public void setLegendShow(String legendShow) {
		this.legendShow = legendShow;
	}

	public void setLegendPosition(String legendPosition) {
		this.legendPosition = legendPosition;
	}

	public void setLegendLabelBoxBorderColor(String legendLabelBoxBorderColor) {
		this.legendLabelBoxBorderColor = legendLabelBoxBorderColor;
	}

	public void setLegendBackgroundColor(String legendBackgroundColor) {
		this.legendBackgroundColor = legendBackgroundColor;
	}

	public void setXaxisTick(String xaxisTick) {
		this.xaxisTick = xaxisTick;
	}

	public void setXaxisTickSize(String xaxisTickSize) {
		this.xaxisTickSize = xaxisTickSize;
	}

	public void setXaxisTickDecimals(String xaxisTickDecimals) {
		this.xaxisTickDecimals = xaxisTickDecimals;
	}

	public void setYaxisTick(String yaxisTick) {
		this.yaxisTick = yaxisTick;
	}

	public void setYaxisTickSize(String yaxisTickSize) {
		this.yaxisTickSize = yaxisTickSize;
	}

	public void setYaxisTickDecimals(String yaxisTickDecimals) {
		this.yaxisTickDecimals = yaxisTickDecimals;
	}

	public void setOnClickTopics(String onClickTopics) {
		this.onClickTopics = onClickTopics;
	}

	public void setOnHoverTopics(String onHoverTopics) {
		this.onHoverTopics = onHoverTopics;
	}

	public void setCrosshair(String crosshair) {
		this.crosshair = crosshair;
	}

	public void setCrosshairMode(String crosshairMode) {
		this.crosshairMode = crosshairMode;
	}

	public void setCrosshairColor(String crosshairColor) {
		this.crosshairColor = crosshairColor;
	}

	public void setCrosshairLineWidth(String crosshairLineWidth) {
		this.crosshairLineWidth = crosshairLineWidth;
	}

	public void setPie(String pie) {
		this.pie = pie;
	}

	public void setPieRadius(String pieRadius) {
		this.pieRadius = pieRadius;
	}

	public void setPieInnerRadius(String pieInnerRadius) {
		this.pieInnerRadius = pieInnerRadius;
	}

	public void setPieLabel(String pieLabel) {
		this.pieLabel = pieLabel;
	}

	public void setPieLabelFormatter(String pieLabelFormatter) {
		this.pieLabelFormatter = pieLabelFormatter;
	}

	public void setPieLabelRadius(String pieLabelRadius) {
		this.pieLabelRadius = pieLabelRadius;
	}

	public void setPieLabelBackgroundColor(String pieLabelBackgroundColor) {
		this.pieLabelBackgroundColor = pieLabelBackgroundColor;
	}

	public void setPieLabelBackgroundOpacity(String pieLabelBackgroundOpacity) {
		this.pieLabelBackgroundOpacity = pieLabelBackgroundOpacity;
	}

	public void setXaxisLabel(String xaxisLabel) {
		this.xaxisLabel = xaxisLabel;
	}

	public void setYaxisLabel(String yaxisLabel) {
		this.yaxisLabel = yaxisLabel;
	}

	public void setXaxisLabelFontSizePixels(String xaxisLabelFontSizePixels) {
		this.xaxisLabelFontSizePixels = xaxisLabelFontSizePixels;
	}

	public void setXaxisLabelFontFamily(String xaxisLabelFontFamily) {
		this.xaxisLabelFontFamily = xaxisLabelFontFamily;
	}

	public void setYaxisLabelFontSizePixels(String yaxisLabelFontSizePixels) {
		this.yaxisLabelFontSizePixels = yaxisLabelFontSizePixels;
	}

	public void setYaxisLabelFontFamily(String yaxisLabelFontFamily) {
		this.yaxisLabelFontFamily = yaxisLabelFontFamily;
	}

	public void setAutoResize(String autoResize) {
	    this.autoResize = autoResize;
	}

}
