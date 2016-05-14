# intro-groovy-gr8workshops
An Introduction to Groovy for the June 2016 Gr8Workshops Course

In a world where productivity is paramount, Groovy rises to the challenge, making it one of the most popular alternate languages on the JVM. Groovy is a dynamic compiled programming language that promotes rapid development, has easy-to-learn syntax and has the ability to leverage existing Java libraries. It also takes features from dynamic languages like Ruby and Python, all while staying compatible with Java. This beginner-level session will explore syntax, basic scripting, APIs and more.

Slides are published at [http://jlstrater.github.io/gr8workshops-intro-groovy](http://jlstrater.github.io/gr8workshops-intro-groovy)

# About the Slides

## Running Locally
This presentation is based on the [Object Partners Reveal Template](https://github.com/objectpartners/opi-reveal-template) which uses jade as a templating engine and grunt to run, reload, and publish the presentation to github pages.

* `npm install`
* `grunt assemble`
* `grunt run`

Source code is in the *src* folder.  The distrubution is in the *dist* folder. Be careful. Changes in *dist* will be overwritten by the next assemble or reload.

## Publishing to github
Github supports web hosting on the gh-pages branch of a repository(like this one!)

If you have forked this repository, the `grunt publish` task takes the dist folder and packages it on the gh-pages branch of your repository. Remember to run `grunt assemble` before publishing.
