package org.apache.jsp.WEB_002dINF.views.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_form_method_commandName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_message_code_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sf_errors_path_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_form_method_commandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sf_errors_path_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.release();
    _jspx_tagPool_sf_form_method_commandName.release();
    _jspx_tagPool_s_url_value_nobody.release();
    _jspx_tagPool_s_message_code_nobody.release();
    _jspx_tagPool_sf_errors_path_cssClass_nobody.release();
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Create Student</title>\n");
      out.write("    <link rel=\"stylesheet\"\n");
      out.write("          type=\"text/css\"\n");
      out.write("          href=\"");
      if (_jspx_meth_s_url_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("    <style>\n");
      out.write("        span.error {\n");
      out.write("            background-color: #ffcccc;\n");
      out.write("            border: 2px solid red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"page-header\" style=\"background-color: #66afe9;margin: 0px !important;\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 col-lg-offset-3 text-center text-capitalize\" style=\"\"><h1><b>Spring MVC + Gradle\n");
      out.write("                Demo</b></h1></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-6 col-lg-offset-3\">\n");
      out.write("            <h3 class=\"text-center\"> ");
      if (_jspx_meth_s_message_0(_jspx_page_context))
        return;
      out.write(" </h3>\n");
      out.write("            ");
      //  sf:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_sf_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_sf_form_method_commandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_sf_form_0.setPageContext(_jspx_page_context);
      _jspx_th_sf_form_0.setParent(null);
      _jspx_th_sf_form_0.setMethod("post");
      _jspx_th_sf_form_0.setCommandName("student");
      int[] _jspx_push_body_count_sf_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_sf_form_0 = _jspx_th_sf_form_0.doStartTag();
        if (_jspx_eval_sf_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                <div class=\"col-lg-6 col-lg-offset-3\">\n");
            out.write("                    <fieldset>\n");
            out.write("                        <label class=\"text-left\" for=\"firstName\">First Name</label>\n");
            out.write("                        ");
            if (_jspx_meth_sf_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write("\n");
            out.write("                        ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_0.setPath("firstName");
            _jspx_th_sf_errors_0.setCssClass("error");
            int[] _jspx_push_body_count_sf_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_0 = _jspx_th_sf_errors_0.doStartTag();
              if (_jspx_th_sf_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_0.doFinally();
              _jspx_tagPool_sf_errors_path_cssClass_nobody.reuse(_jspx_th_sf_errors_0);
            }
            out.write("<br>\n");
            out.write("                    </fieldset>\n");
            out.write("\n");
            out.write("                    <fieldset>\n");
            out.write("                        <label class=\"text-left\" for=\"lastName\">Last Name</label>\n");
            out.write("                        ");
            if (_jspx_meth_sf_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write("\n");
            out.write("                        ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_1.setPath("lastName");
            _jspx_th_sf_errors_1.setCssClass("error");
            int[] _jspx_push_body_count_sf_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_1 = _jspx_th_sf_errors_1.doStartTag();
              if (_jspx_th_sf_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_1.doFinally();
              _jspx_tagPool_sf_errors_path_cssClass_nobody.reuse(_jspx_th_sf_errors_1);
            }
            out.write("<br>\n");
            out.write("                    </fieldset>\n");
            out.write("\n");
            out.write("                    <fieldset>\n");
            out.write("                        <label class=\"text-left\" for=\"emailAddress\">Email Address</label>\n");
            out.write("                        ");
            if (_jspx_meth_sf_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sf_form_0, _jspx_page_context, _jspx_push_body_count_sf_form_0))
              return;
            out.write("\n");
            out.write("                        ");
            //  sf:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_sf_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_sf_errors_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_sf_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_sf_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
            _jspx_th_sf_errors_2.setPath("emailAddress");
            _jspx_th_sf_errors_2.setCssClass("error");
            int[] _jspx_push_body_count_sf_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_sf_errors_2 = _jspx_th_sf_errors_2.doStartTag();
              if (_jspx_th_sf_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_sf_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_sf_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_sf_errors_2.doFinally();
              _jspx_tagPool_sf_errors_path_cssClass_nobody.reuse(_jspx_th_sf_errors_2);
            }
            out.write("<br>\n");
            out.write("                    </fieldset>\n");
            out.write("                    <fieldset>\n");
            out.write("                        <input type=\"submit\" value=\"Create\" class=\"btn btn-success text-center\">\n");
            out.write("                    </fieldset>\n");
            out.write("                </div>\n");
            out.write("\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_sf_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_sf_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_sf_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_sf_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_sf_form_0.doFinally();
        _jspx_tagPool_sf_form_method_commandName.reuse(_jspx_th_sf_form_0);
      }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_s_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_s_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_s_url_0.setPageContext(_jspx_page_context);
    _jspx_th_s_url_0.setParent(null);
    _jspx_th_s_url_0.setValue("/resources/bootstrap.min.css");
    int[] _jspx_push_body_count_s_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_url_0 = _jspx_th_s_url_0.doStartTag();
      if (_jspx_th_s_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_url_0.doFinally();
      _jspx_tagPool_s_url_value_nobody.reuse(_jspx_th_s_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_s_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_s_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_s_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_s_message_0.setPageContext(_jspx_page_context);
    _jspx_th_s_message_0.setParent(null);
    _jspx_th_s_message_0.setCode("create.student");
    int[] _jspx_push_body_count_s_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_message_0 = _jspx_th_s_message_0.doStartTag();
      if (_jspx_th_s_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_message_0.doFinally();
      _jspx_tagPool_s_message_code_nobody.reuse(_jspx_th_s_message_0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_0.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_0.setCssClass("pull-right");
    _jspx_th_sf_input_0.setPath("firstName");
    _jspx_th_sf_input_0.setDynamicAttribute(null, "placeholder", new String("Enter first Name"));
    int[] _jspx_push_body_count_sf_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_0 = _jspx_th_sf_input_0.doStartTag();
      if (_jspx_th_sf_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_0.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_1.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_1.setCssClass("pull-right");
    _jspx_th_sf_input_1.setPath("lastName");
    _jspx_th_sf_input_1.setDynamicAttribute(null, "placeholder", new String("Enter last Name"));
    int[] _jspx_push_body_count_sf_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_1 = _jspx_th_sf_input_1.doStartTag();
      if (_jspx_th_sf_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_1.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_sf_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sf_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_sf_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sf:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_sf_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_sf_input_2.setPageContext(_jspx_page_context);
    _jspx_th_sf_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sf_form_0);
    _jspx_th_sf_input_2.setCssClass("pull-right");
    _jspx_th_sf_input_2.setPath("emailAddress");
    _jspx_th_sf_input_2.setDynamicAttribute(null, "placeholder", new String("Enter email address"));
    int[] _jspx_push_body_count_sf_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_sf_input_2 = _jspx_th_sf_input_2.doStartTag();
      if (_jspx_th_sf_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sf_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sf_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sf_input_2.doFinally();
      _jspx_tagPool_sf_input_placeholder_path_cssClass_nobody.reuse(_jspx_th_sf_input_2);
    }
    return false;
  }
}
