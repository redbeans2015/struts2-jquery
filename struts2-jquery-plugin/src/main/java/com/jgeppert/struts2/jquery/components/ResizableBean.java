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

package com.jgeppert.struts2.jquery.components;

/**
 * 
 * @author <a href="http://www.jgeppert.com">Johannes Geppert</a>
 * 
 */
public interface ResizableBean {

  void setResizable(String resizable);

  void setResizableAnimate(String animate);

  void setResizableAnimateDuration(String animateDuration);

  void setResizableAnimateEasing(String animateEasing);

  void setResizableAspectRatio(String aspectRatio);

  void setResizableAutoHide(String autoHide);

  void setResizableContainment(String containment);

  void setResizableDelay(String delay);

  void setResizableDistance(String distance);

  void setResizableGhost(String ghost);

  void setResizableHelper(String helper);

  void setResizableMaxHeight(String maxHeight);

  void setResizableMaxWidth(String maxWidth);

  void setResizableMinHeight(String minHeight);

  void setResizableMinWidth(String minWidth);

  void setResizableOnStartTopics(String start);

  void setResizableOnResizeTopics(String resize);

  void setResizableOnStopTopics(String stop);

  void setResizableHandles(String handles);
}
