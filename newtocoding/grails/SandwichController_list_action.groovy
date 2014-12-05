package grails_demo

class SandwichController {

    def list() {
        List x = Sandwich.list()
        Map m = [sandwiches: x]

        return m
    }
}