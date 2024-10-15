# ServletCalculator

Servlet demo using Apache Tomcat server, multiple servelts, and cookies to do calculations.

index.html: Creates a lightweight front end web page where users can input 2 numbers and submit them.

AddServlet.java: Fetches the data, adds them, stores the result in a cookie and sends the cookie to the other servlet.

SqServlet.java: Receives the cookie from AddServlet, fetches the value, squares the value, then outputs the result to the user.

web.xml: Configures the two servlets

To run:
Connect application to a Tomcat server and visit the url.
Example: "(http://localhost:8080/DemoApp/index.html)"

Expected output:
First page:
5
5
-> Submit
Redirected to second page:
Result is 100
