def show() {
    Sandwich sandwich = Sandwich.get(params.id)
    Map m = [
            name: sandwich.name,
            breadSlices: sandwich.breadSlices,
            tomatoes: sandwich.tomatoes,
            meat: sandwich.meat
    ]

    return m
}
