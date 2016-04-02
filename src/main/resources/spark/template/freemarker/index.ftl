<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="stylesheets/style.css">
</head>
<body>
  <div class="header">
  <div class="header-logo"><a href="index.html"><img src="image/logo.png" alt="No picture"></a></div>
  <div class="header-nav">
    <form id="search" method="post" action="index.html">
    <input type="text" placeholder="Jobs" />
    <input type="text" placeholder="Location"/>
    <button value="search">search</button>
   </form>
</div>
  <div class="header-clogin"><button onclick="location.href='index.html';">Company</button></div>
  <div class="header-ulogin"><button onclick="location.href='login.html';">Login</button></div>
  	<div class="header-date"><button onclick="location.href='index.html';"><#list dayOfWeek as sect><#if sect_index == 1>M:${sect}
  	<#elseif sect_index==2>D:${sect}<br/></#if>
  	</#list><#list timeOfDay as sict>
  	<#if sict_index==0>
  	H: ${sict}
  	</#if>
  	</#list></button></div>
  <div class="header-nav1">
    <table>
      <tr>
      <td><a href="">Personal</a></td>
      <td><a href="WorkList.html">Interns</a></td>
      <td><a href="">Resource</a></td>
    </tr>
    </table>
  </div>
</div>
  <div class="MainMiddle">
  <div class="MainMiddleLeft">
    <div class="transbox">
      <a href=""><p>Get Started</p>
      <img src="image/Hat.jpeg" alt="No picture"/>
        <br><p>Upload Information</p>
    </a>
    </div>
  </div>
  <div class="MainMiddleRight">
    <div class="transbox">
      <a href=""><p>Find an Employee</p>
      <img src="image/Employer.jpg" alt="No picture"/>
      <br><p>Post jobs</p>
    </a>
    </div>
  </div>
  </div>
  <div class="MainDown">
  <div class="MainDownLeft">
    <div class="StarComp">
      <div class="upper">
            Featured Company
      </div>
      <div class="middle">
        <br><br>
            <img src="image/Cop01.png" alt="No picture"/><br>
            best company so far
      </div>
      <div class="lower">
            go check
      </div>
    </div>
    <div class="StarComp">
      <div class="upper">
            Featured Company
      </div>
      <div class="middle">
        <br><br>
            <img src="image/Cop02.png" alt="No picture"/><br>
            best company so far
      </div>
      <div class="lower">
            go check
      </div>
    </div>
    <div class="StarComp">
      <div class="upper">
            Featured Company
      </div>
      <div class="middle">
        <br><br>
            <img src="image/Cop03.png" alt="No picture"/><br>
            best company so far
      </div>
      <div class="lower">
            go check
      </div>
    </div>
  </div>
  <div class="MainDownRight">
    <div class="StarComp">
      <div class="upper">
            Featured article
      </div>
      <div class="middle">
        <br><br>
            <img src="image/Cop01.png" alt="No picture"/><br>
            .......
      </div>
      <div class="lower">
            Full article
      </div>
    </div>
    <div class="StarComp">
      <div class="upper">
            Featured article
      </div>
      <div class="middle">
        <br><br>
            <img src="image/Cop02.png" alt="No picture"/><br>
            .......
      </div>
      <div class="lower">
            Full article
      </div>
    </div>
    <div class="StarComp">
      <div class="upper">
            Featured article
      </div>
      <div class="middle">
        <br><br>
            <img src="image/Cop03.png" alt="No picture"/><br>
            .......
      </div>
      <div class="lower">
            Full article
      </div>
    </div>
  </div>
</div>
  <div class="footer">
    @University of Pittsburgh <a href="About_us.html">About us</a>
  </div>
  <div>
  </div>
</body>
</html>

