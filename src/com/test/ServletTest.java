package com.test;


import javax.servlet.*;
import java.io.IOException;

public class ServletTest implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        /*
        在 Servlet 的生命期中，仅执行一次 init() 方法。它是在服务器装入 Servlet 时执行的。 可以配置服务器，
        以在启动服务器或客户机首次访问 Servlet 时装入 Servlet 。 无论有多少客户机访问 Servlet ，都不会重复执行 init() 。
        缺省的 init() 方法通常是符合要求的，但也可以用定制 init() 方法来覆盖它，典型的是管理服务器端资源。
         例如，可能编写一个定制 init() 来只用于一次装入 GIF 图像，改进 Servlet 返回 GIF 图像和含有多个客户机请求的性能。
         另一个示例是初始化数据库连接。缺省的 init() 方法设置了 Servlet 的初始化参数，并用它的 ServletConfig 对象
         参数来启动配置， 因此所有覆盖 init() 方法的 Servlet 应调用 super.init() 以确保仍然执行这些任务。
         在调用 service() 方法之前，应确保已完成了 init() 方法。

        */
    }

    @Override
    public ServletConfig getServletConfig() {
        //读取配置文件
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        /*
        service() 方法是 Servlet 的核心。每当一个客户请求一个 HttpServlet 对象，该对象的 service() 方法就要被调用，
        而且传递给这个方法一个“请求”（ ServletRequest ）对象和一个“响应”（ ServletResponse ）对象作为参数。
        在 HttpServlet 中已存在 service() 方法。缺省的服务功能是调用与 HTTP 请求的方法相应的 do 功能。例如，
         如果 HTTP 请求方法为 GET ，则缺省情况下就调用 doGet() 。 Servlet 应该为 Servlet 支持的 HTTP 方法覆盖 do 功能
         。因为 HttpServlet.service() 方法会检查请求方法是否调用了适当的处理方法，不必要覆盖 service() 方法。
         只需覆盖相应的 do 方法就可以了。
        = 当一个客户通过 HTML 表单发出一个 HTTP POST 请求时， doPost （）方法被调用。 与 POST 请求相关的参数作为一个单独
        的 HTTP 请求从浏览器发送到服务器。当需要修改服务器端的数据时，应该使用 doPost() 方法。
        = 当一个客户通过 HTML 表单发出一个 HTTP GET 请求或直接请求一个 URL 时， doGet() 方法被调用。
         与 GET 请求相关的参数添加到 URL 的后面，并与这个请求一起发送。当不会修改服务器端的数据时，应该使用 doGet() 方法。
        Servlet 的响应可以是下列几种类型：
        一个输出流，浏览器根据它的内容类型（如 text/HTML ）进行解释。
        一个 HTTP 错误响应 , 重定向到另一个 URL 、 servlet 、 JSP 。
        */
    }

    @Override
    public String getServletInfo() {
        /*

        GetServletInfo()方法是一个可选的方法，它提供有关servlet的信息，如作者、版本、版权。
    当服务器调用Servlet的Service()、doGet()和doPost()这3个方法时，均需要"请求"和"响应"对象作为参数。
    "请求"对象提供有关请求的信息，而"响应"对象提供了一个将响应信息返回给浏览器的一个通信途径。

         */
        return null;
    }

    @Override
    public void destroy() {
        //销毁
    }
}
