def save() {
    Sandwich sandwich = new Sandwich()
    sandwich.name = params.name
    sandwich.breadSlices = params.breadSlices.toInteger()
    sandwich.tomatoes = params.tomatoes.toInteger()
    sandwich.meat = params.meat
    sandwich.save()

    Map m = [id: sandwich.id]
    redirect([action: "show", params: m])
}

