{{define "page"}}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>About Me - Hypermind</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A page of Hypermind.">
    <meta name="author" content="hyper-carrot">

    {{template "header-import"}}
    {{template "js-import"}}

</head>
<body>

{{template "top-navbar" .}}

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            {{template "about-navbar" .}}
        </div>
        <div class="span10">
            <div class="hero-unit">
                <p>
                    My name is Harry Hao.
                    I live in Beijing.
                    I am in Sohu Inc (NSDQ: SOHU) as the position of Dev Leader.
                </p>
                <p>
                    I'm a broad interests software developer. I'm a open source fan, and pay attention to the agile methods and software process improvement.
                    I focus on Clojure and Go programming language, and contribute strength in order to the popularization of them in Chinese community.
                </p>
                <p>
                    My homepage on GitHub: 
                    <a class="btn btn-small" href="https://github.com/hyper-carrot" target="_blank">hyper-carrot</a>
                    .
                    And, my homepage on Linkedin: 
                    <a class="btn btn-small" href="http://www.linkedin.com/pub/harry-hao/1b/a19/59" target="_blank">Harry Hao</a>
                    .
                </p>
                <p>
                    <label><h3>CV Authorization Code</h3></label>
                    <input id="cv_auth_code"type="text" class="input-medium search-query" placeholder="Please inquire with me.">
                    <button id="cv_auth_code_submit" type="submit" class="btn btn-primary">Submit</button>
                </p>
            </div>
        </div>
    </div>
</div>

</body>
</html>
{{end}}
