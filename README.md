# springmvc-searchapp

# To use App:
1.Configure Dispatcher servlet in web.xml file(src/main/webapp/WEB-INF/web.xml)
2.Configure new  Spring Bean Configurtion file dispatcher-servlet.xml(src/main/webapp/WEB-INF/dispatcher-servlet.xml)
3.Configure InternalResourceViewResolver in dispatcher-servlet.xml

**i) Google Search from searchapp-** 

add 1.spring-webmvc , 2. jstl , 3. javax.servlet-api in pom.xml and 
hit url: http://localhost:8080/springmvc-searchapp
_Keywords: RedirectView @RequestParam_

**ii) Basic Registration App** and Redirecting to Success page and Displaying
customer info.
and implemented custom error page by using **@Exceptionhandler**
hit url:http://localhost:8080/springmvc-searchapp/login

**iii) File Uploading** 

add commons-fileupload, commons-io in pom.xml

hit url: http://localhost:8080/springmvc-searchapp/upload





