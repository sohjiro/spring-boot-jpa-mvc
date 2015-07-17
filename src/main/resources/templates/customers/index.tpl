yieldUnescaped '<!DOCTYPE html>'
html {
  head {
    meta('http-equiv':'"Content-Type" content:"text/html; charset=utf-8"')
    title('Getting Started: Serving Web Content')
  }
  body {
    ul {
      customers.each {
        li("${it.firstName} ${it.lastName}")
      }
    }
  }
}
script(type:"text/javascript", src:"/js/jquery-2.1.4.js")
