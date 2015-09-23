<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags" %>
<h2>Grid (Editable/Multiselect)</h2>

<p class="text">
	A editable Grid with pager and navigator. This Grid is sortable by name column and multiple rows can be selected.
</p>
<s:url var="remoteurl" action="grid-data-provider" namespace="/grid"/>
<s:url var="editurl" action="edit-grid-entry" namespace="/grid"/>
<sjg:grid
		id="gridmultitable"
		caption="Customers Examples (Editable/Multiselect)"
		dataType="json"
		href="%{remoteurl}"
		pager="true"
		toppager="true"
		navigator="true"
		navigatorSearchOptions="{sopt:['eq','ne','lt','gt']}"
		navigatorAddOptions="{height:280,reloadAfterSubmit:true}"
		navigatorEditOptions="{height:280,reloadAfterSubmit:false}"
		navigatorEdit="true"
		navigatorView="true"
		navigatorDelete="true"
		navigatorDeleteOptions="{height:280,reloadAfterSubmit:true}"
		gridModel="gridModel"
		rowList="10,15,20"
		rowNum="15"
		editurl="%{editurl}"
		multiselect="true"
		>
	<sjg:gridColumn name="id" index="id" title="ID" width="30" formatter="integer" editable="false" sortable="false"
	                search="true" searchoptions="{sopt:['eq','ne','lt','gt']}"/>
	<sjg:gridColumn name="name" index="name" title="Name" width="250" editable="true" edittype="text" sortable="true"
	                search="false"/>
	<sjg:gridColumn name="lastName" index="lastName" title="Last Name" sortable="false" hidden="true"/>
	<sjg:gridColumn name="firstName" index="firstName" title="First Name" sortable="false" hidden="true"/>
	<sjg:gridColumn name="addressLine1" index="addressLine1" title="Adress" sortable="false" hidden="true"/>
	<sjg:gridColumn name="country" index="country" title="Country" editable="true" edittype="select"
	                editoptions="{value:'France:France;USA:USA;Australia:Australia;Norway:Norway;Poland:Poland;Germany:Germany;Spain:Spain'}"
	                sortable="false" search="false"/>
	<sjg:gridColumn name="city" index="city" title="City" editable="true" edittype="text" sortable="false"
	                search="false"/>
	<sjg:gridColumn name="creditLimit" index="creditLimit" title="Credit Limit" align="right" formatter="currency"
	                editable="true" edittype="text" sortable="false" search="false"/>
</sjg:grid>
<br/>
<sj:submit id="grid_multi_getselectedbutton" value="Get Selected Rows" onClickTopics="getselectedids" button="true"/>

<br/>
<sj:tabbedpanel id="localtabs" cssClass="list">
<sj:tab id="tab1" target="javascript" label="JavaScript"/>
<sj:tab id="tab2" target="jsp" label="JSP"/>
<sj:tab id="tab3" target="java" label="Struts2 Action"/>
<div id="javascript">
	  <pre>
    $.subscribe('getselectedids', function(event,data) {
    	var s;
    	s = $(&quot;#gridmultitable&quot;).jqGrid('getGridParam','selarrrow');
    	alert('Selected Rows : '+s);
  	});
	  </pre>
</div>
<div id="jsp">
	  <pre>
    &lt;s:url id=&quot;remoteurl&quot; action=&quot;grid-data-provider&quot; namespace=&quot;/grid&quot;/&gt;
    &lt;s:url id=&quot;editurl&quot; action=&quot;edit-grid-entry&quot;/&gt;
    &lt;sj:grid
    	id=&quot;gridmultitable&quot;
    	caption=&quot;Customer Examples (Editable/Multiselect)&quot;
    	dataType=&quot;json&quot;
    	href=&quot;%{remoteurl}&quot;
    	pager=&quot;true&quot;
    	navigator=&quot;true&quot;
    	navigatorSearchOptions=&quot;{sopt:['eq','ne','lt','gt']}&quot;
    	navigatorAddOptions=&quot;{height:280,reloadAfterSubmit:true}&quot;
    	navigatorEditOptions=&quot;{height:280,reloadAfterSubmit:false}&quot;
    	navigatorEdit=&quot;true&quot;
    	navigatorView=&quot;true&quot;
    	navigatorDelete=&quot;true&quot;
    	navigatorDeleteOptions=&quot;{height:280,reloadAfterSubmit:true}&quot;
    	gridModel=&quot;gridModel&quot;
    	rowList=&quot;10,15,20&quot;
    	rowNum=&quot;15&quot;
    	editurl=&quot;%{editurl}&quot;
    	multiselect=&quot;true&quot;
    	onSelectRowTopics=&quot;rowselect&quot;
    &gt;
    	&lt;sj:gridColumn name=&quot;id&quot; index=&quot;id&quot; title=&quot;ID&quot; formatter=&quot;integer&quot; editable=&quot;false&quot; sortable=&quot;false&quot; search=&quot;true&quot; searchoptions=&quot;{sopt:['eq','ne','lt','gt']}&quot;/&gt;
    	&lt;sj:gridColumn name=&quot;name&quot; index=&quot;name&quot; title=&quot;Name&quot; editable=&quot;true&quot; edittype=&quot;text&quot; sortable=&quot;true&quot; search=&quot;false&quot;/&gt;
    	&lt;sj:gridColumn name=&quot;lastName&quot; index=&quot;lastName&quot; title=&quot;Last Name&quot; sortable=&quot;false&quot; hidden=&quot;true&quot;/&gt;
    	&lt;sj:gridColumn name=&quot;firstName&quot; index=&quot;firstName&quot; title=&quot;First Name&quot; sortable=&quot;false&quot; hidden=&quot;true&quot;/&gt;
    	&lt;sj:gridColumn name=&quot;addressLine1&quot; index=&quot;addressLine1&quot; title=&quot;Adress&quot; sortable=&quot;false&quot; hidden=&quot;true&quot;/&gt;
    	&lt;sj:gridColumn name=&quot;country&quot; index=&quot;country&quot; title=&quot;Country&quot; editable=&quot;true&quot; edittype=&quot;select&quot; editoptions=&quot;{value:'France:France;USA:USA;Australia:Australia;Norway:Norway;Poland:Poland;Germany:Germany;Spain:Spain'}&quot; sortable=&quot;false&quot; search=&quot;false&quot;/&gt;
    	&lt;sj:gridColumn name=&quot;city&quot; index=&quot;city&quot; title=&quot;City&quot; editable=&quot;true&quot; edittype=&quot;text&quot; sortable=&quot;false&quot; search=&quot;false&quot;/&gt;
    	&lt;sj:gridColumn name=&quot;creditLimit&quot; index=&quot;creditLimit&quot; title=&quot;Credit Limit&quot; formatter=&quot;currency&quot; editable=&quot;true&quot; edittype=&quot;text&quot; sortable=&quot;false&quot; search=&quot;false&quot;/&gt;
    &lt;/sj:grid&gt;
	&lt;br/&gt;
    &lt;sj:submit id=&quot;grid_multi_getselectedbutton&quot; value=&quot;Get Selected Rows&quot; onClickTopics=&quot;getselectedids&quot; button=&quot;true&quot;/&gt;
	  </pre>
</div>
<div id="java">
<pre>
package com.jgeppert.struts2.jquery.showcase.grid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;

import com.jgeppert.struts2.jquery.showcase.model.Customer;
import com.jgeppert.struts2.jquery.showcase.model.CustomerDAO;
import com.opensymphony.xwork2.ActionSupport;

@Result(name = &quot;success&quot;, type = &quot;json&quot;)
public class GridDataProvider extends ActionSupport implements SessionAware {

  private static final long   serialVersionUID = 5078264277068533593L;
  private static final Log    log              = LogFactory.getLog(GridDataProvider.class);

  // Your result List
  private List&lt;Customer&gt;      gridModel;

  // get how many rows we want to have into the grid - rowNum attribute in the
  // grid
  private Integer             rows             = 0;

  // Get the requested page. By default grid sets this to 1.
  private Integer             page             = 0;

  // sorting order - asc or desc
  private String              sord;

  // get index row - i.e. user click to sort.
  private String              sidx;

  // Search Field
  private String              searchField;

  // The Search String
  private String              searchString;

  // Limit the result when using local data, value form attribute rowTotal
  private Integer             totalrows;

  // he Search Operation
  // ['eq','ne','lt','le','gt','ge','bw','bn','in','ni','ew','en','cn','nc']
  private String              searchOper;

  // Your Total Pages
  private Integer             total            = 0;

  // All Records
  private Integer             records          = 0;

  private boolean             loadonce         = false;
  private Map&lt;String, Object&gt; session;
  private List&lt;Customer&gt;      myCustomers;

  public String execute()
  {
    log.debug(&quot;Page &quot; + getPage() + &quot; Rows &quot; + getRows() + &quot; Sorting Order &quot; + getSord() + &quot; Index Row :&quot; + getSidx());
    log.debug(&quot;Search :&quot; + searchField + &quot; &quot; + searchOper + &quot; &quot; + searchString);

    Object list = session.get(&quot;mylist&quot;);
    if (list != null)
    {
      myCustomers = (List&lt;Customer&gt;) list;
    }
    else
    {
      log.debug(&quot;Build new List&quot;);
      myCustomers = CustomerDAO.buildList();
    }

    if (sord != null &amp;&amp; sord.equalsIgnoreCase(&quot;asc&quot;))
    {
      Collections.sort(myCustomers);
    }
    if (sord != null &amp;&amp; sord.equalsIgnoreCase(&quot;desc&quot;))
    {
      Collections.sort(myCustomers);
      Collections.reverse(myCustomers);
    }

    // Count all record (select count(*) from your_custumers)
    records = CustomerDAO.getCustomersCount(myCustomers);

    if (totalrows != null)
    {
      records = totalrows;
    }

    // Calucalate until rows ware selected
    int to = (rows * page);

    // Calculate the first row to read
    int from = to - rows;

    // Set to = max rows
    if (to &gt; records) to = records;

    if (loadonce)
    {
      if (totalrows != null &amp;&amp; totalrows &gt; 0)
      {
        setGridModel(myCustomers.subList(0, totalrows));
      }
      else
      {
        // All Custumer
        setGridModel(myCustomers);
      }
    }
    else
    {
      // Search Custumers
      if (searchString != null &amp;&amp; searchOper != null)
      {
        int id = Integer.parseInt(searchString);
        if (searchOper.equalsIgnoreCase(&quot;eq&quot;))
        {
          log.debug(&quot;search id equals &quot; + id);
          List&lt;Customer&gt; cList = new ArrayList&lt;Customer&gt;();
          Customer customer = CustomerDAO.findById(myCustomers, id);

          if (customer != null) cList.add(customer);

          setGridModel(cList);
        }
        else if (searchOper.equalsIgnoreCase(&quot;ne&quot;))
        {
          log.debug(&quot;search id not &quot; + id);
          setGridModel(CustomerDAO.findNotById(myCustomers, id, from, to));
        }
        else if (searchOper.equalsIgnoreCase(&quot;lt&quot;))
        {
          log.debug(&quot;search id lesser then &quot; + id);
          setGridModel(CustomerDAO.findLesserAsId(myCustomers, id, from, to));
        }
        else if (searchOper.equalsIgnoreCase(&quot;gt&quot;))
        {
          log.debug(&quot;search id greater then &quot; + id);
          setGridModel(CustomerDAO.findGreaterAsId(myCustomers, id, from, to));
        }
      }
      else
      {
        setGridModel(CustomerDAO.getCustomers(myCustomers, from, to));
      }
    }

    // Calculate total Pages
    total = (int) Math.ceil((double) records / (double) rows);

    // only for showcase functionality, don't do this in production
    session.put(&quot;mylist&quot;, myCustomers);

    return SUCCESS;
  }

  public String getJSON()
  {
    return execute();
  }

  /**
   * @return how many rows we want to have into the grid
   */
  public Integer getRows()
  {
    return rows;
  }

  /**
   * @param rows
   *          how many rows we want to have into the grid
   */
  public void setRows(Integer rows)
  {
    this.rows = rows;
  }

  /**
   * @return current page of the query
   */
  public Integer getPage()
  {
    return page;
  }

  /**
   * @param page
   *          current page of the query
   */
  public void setPage(Integer page)
  {
    this.page = page;
  }

  /**
   * @return total pages for the query
   */
  public Integer getTotal()
  {
    return total;
  }

  /**
   * @param total
   *          total pages for the query
   */
  public void setTotal(Integer total)
  {
    this.total = total;
  }

  /**
   * @return total number of records for the query. e.g. select count(*) from
   *         table
   */
  public Integer getRecords()
  {
    return records;
  }

  /**
   * @param record
   *          total number of records for the query. e.g. select count(*) from
   *          table
   */
  public void setRecords(Integer records)
  {

    this.records = records;

    if (this.records &gt; 0 &amp;&amp; this.rows &gt; 0)
    {
      this.total = (int) Math.ceil((double) this.records / (double) this.rows);
    }
    else
    {
      this.total = 0;
    }
  }

  /**
   * @return an collection that contains the actual data
   */
  public List&lt;Customer&gt; getGridModel()
  {
    return gridModel;
  }

  /**
   * @param gridModel
   *          an collection that contains the actual data
   */
  public void setGridModel(List&lt;Customer&gt; gridModel)
  {
    this.gridModel = gridModel;
  }

  /**
   * @return sorting order
   */
  public String getSord()
  {
    return sord;
  }

  /**
   * @param sord
   *          sorting order
   */
  public void setSord(String sord)
  {
    this.sord = sord;
  }

  /**
   * @return get index row - i.e. user click to sort.
   */
  public String getSidx()
  {
    return sidx;
  }

  /**
   * @param sidx
   *          get index row - i.e. user click to sort.
   */
  public void setSidx(String sidx)
  {
    this.sidx = sidx;
  }

  public void setSearchField(String searchField)
  {
    this.searchField = searchField;
  }

  public void setSearchString(String searchString)
  {
    this.searchString = searchString;
  }

  public void setSearchOper(String searchOper)
  {
    this.searchOper = searchOper;
  }

  public void setLoadonce(boolean loadonce)
  {
    this.loadonce = loadonce;
  }

  public void setSession(Map&lt;String, Object&gt; session)
  {
    this.session = session;
  }

  public void setTotalrows(Integer totalrows)
  {
    this.totalrows = totalrows;
  }

}

	  </pre>
</div>
</sj:tabbedpanel>
