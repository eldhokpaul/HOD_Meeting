<html>
<head>
</head>
<body>

 <h1> shop owner registration</h1>
  <form>
    <table height="102" border="1">
    <tr>
        <th width="74">shop_name</th>
		<th width="317"><input type="text" name="shop_name"></th>
    </tr>
    <tr>
      <th>owner_name </th>
      <th><input type="text" name="owner_name"></th>
    </tr>
          <tr>
      <th>phone_no </th>
      <th><input type="text" name="phone_no"></th>
    </tr>
          <tr>
      <th>e-mail </th>
      <th><input type="text" name="e-mail"></th>
    </tr>
          <tr>
      <th>latitude </th>
      <th><input type="text" name="latitude"></th>
    </tr>
          <tr>
      <th>longitude </th>
      <th><input type="text" name="longitude"></th>
    </tr>
          <tr>
      <th>building_name </th>
      <th><input type="text" name="building_name"></th>
    </tr>  <tr>
      <th>place </th>
      <th><input type="text" name="place"></th>
    </tr>
      <tr>
      <th>pin_code </th>
      <th><input type="text" name="pin_code"></th>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><label>
        <input type="submit" name="Submit" value="Submit" />
      </label></td>
    </tr>
	</table>
	 </form>
</body>
</html>
<%
    String s_name=request.getParameter("shop_name");
String ownername=request.getParameter("owner_name");
String ph_no=request.getParameter("phone_no");
String e_mail=request.getParameter("e-mail");
String lat=request.getParameter("latitude");
String lon=request.getParameter("longituge");
String build_name=request.getParameter("building_name");
String places=request.getParameter("place");
String pin=request.getParameter("pin_code");
%>