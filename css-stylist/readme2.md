this in netlify.toml

[[redirects]]
  force = true
  from = "https://main--evented.netlify.app/"
  status = 200
  to = ""

  [[headers]]
  for = "/*" # you can configure the correct paths here
  [headers.values]
    access-control-allow-origin = "*" # see a list of allowed values here: https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin