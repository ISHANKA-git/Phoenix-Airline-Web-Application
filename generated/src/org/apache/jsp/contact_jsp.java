package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Contact - Travel</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("<!-- \n");
      out.write("Travel Template\n");
      out.write("http://www.templatemo.com/tm-409-travel\n");
      out.write("-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\t\t<meta name=\"author\" content=\"templatemo\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,800,700,600,300' rel='stylesheet' type='text/css'>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_misc.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_style.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/modernizr-2.6.1-respond-1.1.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 7]>\n");
      out.write("            <p class=\"chromeframe\">You are using an outdated browser. <a href=\"http://browsehappy.com/\">Upgrade your browser today</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">install Google Chrome Frame</a> to better experience this site.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <div class=\"site-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"main-header\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 col-sm-6 col-xs-10\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <img src=\"images/logo.png\" alt=\"travel html5 template\" title=\"travel html5 template\">\n");
      out.write("                                </a>\n");
      out.write("                            </div> <!-- /.logo -->\n");
      out.write("                        </div> <!-- /.col-md-4 -->\n");
      out.write("                        <div class=\"col-md-8 col-sm-6 col-xs-2\">\n");
      out.write("                            <div class=\"main-menu\">\n");
      out.write("                                <ul class=\"visible-lg visible-md\">\n");
      out.write("                                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                    <li><a href=\"services.jsp\">Services</a></li>\n");
      out.write("                                    <li><a href=\"events.jsp\">Events</a></li>\n");
      out.write("                                \t<li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                                    <li class=\"active\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <a href=\"#\" class=\"toggle-menu visible-sm visible-xs\">\n");
      out.write("                                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </div> <!-- /.main-menu -->\n");
      out.write("                        </div> <!-- /.col-md-8 -->\n");
      out.write("                    </div> <!-- /.row -->\n");
      out.write("                </div> <!-- /.main-header -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 visible-sm visible-xs\">\n");
      out.write("                        <div class=\"menu-responsive\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                                <li><a href=\"services.html\">Services</a></li>\n");
      out.write("                                <li><a href=\"events.html\">Events</a></li>\n");
      out.write("                                <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("                                <li class=\"active\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div> <!-- /.menu-responsive -->\n");
      out.write("                    </div> <!-- /.col-md-12 -->\n");
      out.write("                </div> <!-- /.row -->\n");
      out.write("            </div> <!-- /.container -->\n");
      out.write("        </div> <!-- /.site-header -->\n");
      out.write("\n");
      out.write("        <div class=\"page-top\" id=\"templatemo_contact\">\n");
      out.write("        </div> <!-- /.page-header -->\n");
      out.write("\n");
      out.write("        <div class=\"contact-page\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-7 col-sm-6 map-wrapper\">\n");
      out.write("                        <h3 class=\"widget-title\">Our Location</h3>\n");
      out.write("                        <div class=\"map-holder\"></div>\n");
      out.write("                        <div class=\"contact-infos\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li>987 Nay Yar Street, Analog Estate</li>\n");
      out.write("                                <li>Yangon 10440, Myanmar</li>\n");
      out.write("                                <li>Tel: 090-090-0880</li>\n");
      out.write("                                <li>Email: <a href=\"mailto:info@company.com\">info@company.com</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-5 col-sm-6\">\n");
      out.write("                        <h3 class=\"widget-title\">Contact Us</h3>\n");
      out.write("                        <div class=\"contact-form\">\n");
      out.write("                            <form name=\"contactform\" id=\"contactform\" action=\"#\" method=\"post\">\n");
      out.write("                                <p>\n");
      out.write("                                    <input name=\"name\" type=\"text\" id=\"name\" placeholder=\"Your Name\">\n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    <input name=\"email\" type=\"text\" id=\"email\" placeholder=\"Your Email\"> \n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    <input name=\"subject\" type=\"text\" id=\"subject\" placeholder=\"Subject\"> \n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    <textarea name=\"message\" id=\"message\" placeholder=\"Message\"></textarea>    \n");
      out.write("                                </p>\n");
      out.write("                                <input type=\"submit\" class=\"mainBtn\" id=\"submit\" value=\"Send Message\">\n");
      out.write("                            </form>\n");
      out.write("                        </div> <!-- /.contact-form -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"partner-list\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                        <div class=\"partner-item\">\n");
      out.write("                            <img src=\"images/partners/partner1.png\" alt=\"\">\n");
      out.write("                        </div> <!-- /.partner-item -->\n");
      out.write("                    </div> <!-- /.col-md-2 -->\n");
      out.write("                    <div class=\"col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                        <div class=\"partner-item\">\n");
      out.write("                            <img src=\"images/partners/partner2.png\" alt=\"\">\n");
      out.write("                        </div> <!-- /.partner-item -->\n");
      out.write("                    </div> <!-- /.col-md-2 -->\n");
      out.write("                    <div class=\"col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                        <div class=\"partner-item\">\n");
      out.write("                            <img src=\"images/partners/partner3.png\" alt=\"\">\n");
      out.write("                        </div> <!-- /.partner-item -->\n");
      out.write("                    </div> <!-- /.col-md-2 -->\n");
      out.write("                    <div class=\"col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                        <div class=\"partner-item\">\n");
      out.write("                            <img src=\"images/partners/partner1.png\" alt=\"\">\n");
      out.write("                        </div> <!-- /.partner-item -->\n");
      out.write("                    </div> <!-- /.col-md-2 -->\n");
      out.write("                    <div class=\"col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                        <div class=\"partner-item\">\n");
      out.write("                            <img src=\"images/partners/partner2.png\" alt=\"\">\n");
      out.write("                        </div> <!-- /.partner-item -->\n");
      out.write("                    </div> <!-- /.col-md-2 -->\n");
      out.write("                    <div class=\"col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                        <div class=\"partner-item last\">\n");
      out.write("                            <img src=\"images/partners/partner3.png\" alt=\"\">\n");
      out.write("                        </div> <!-- /.partner-item -->\n");
      out.write("                    </div> <!-- /.col-md-2 -->\n");
      out.write("                </div> <!-- /.row -->\n");
      out.write("            </div> <!-- /.container -->\n");
      out.write("        </div> <!-- /.partner-list -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"site-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                        <div class=\"footer-logo\">\n");
      out.write("                            <a href=\"index.html\">\n");
      out.write("                                <img src=\"images/logo.png\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- /.col-md-4 -->\n");
      out.write("                    <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                        <div class=\"copyright\">\n");
      out.write("                            <span>Copyright &copy; 2014 <a href=\"#\">Company Name</a></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- /.col-md-4 -->\n");
      out.write("                    <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                        <ul class=\"social-icons\">\n");
      out.write("                            <li><a href=\"#\" class=\"fa fa-facebook\"></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"fa fa-twitter\"></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"fa fa-linkedin\"></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"fa fa-flickr\"></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"fa fa-rss\"></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div> <!-- /.col-md-4 -->\n");
      out.write("                </div> <!-- /.row -->\n");
      out.write("            </div> <!-- /.container -->\n");
      out.write("        </div> <!-- /.site-footer -->\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.0.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Google Map -->\n");
      out.write("        <script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n");
      out.write("        <script src=\"js/vendor/jquery.gmap3.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- Google Map Init-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(function($){\n");
      out.write("                $('.first-map, .map-holder').gmap3({\n");
      out.write("                    marker:{\n");
      out.write("                        address: '16.8496189,96.1288854' \n");
      out.write("                    },\n");
      out.write("                        map:{\n");
      out.write("                        options:{\n");
      out.write("                        zoom: 16,\n");
      out.write("                        scrollwheel: false,\n");
      out.write("                        streetViewControl : true\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- templatemo 409 travel -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
