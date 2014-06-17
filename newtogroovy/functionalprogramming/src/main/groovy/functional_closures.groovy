
input = ['hello', 'there', 'people']

//closures as referentially transparent functions
nth = { sequence, index -> sequence[index - 1] }
assert nth(input, 3) == 'people'

reverse = { it.reverse() }
assert reverse(input) == ['people', 'there', 'hello']
assert input.collect(reverse) == ['olleh', 'ereht', 'elpoep']

capitalize = { it.toUpperCase() }
assert input.collect(capitalize) == ['HELLO', 'THERE', 'PEOPLE']

//convert a method to  a closure
import org.codehaus.groovy.runtime.DefaultGroovyMethods
def find = DefaultGroovyMethods.&find //
assert find(input) { it.endsWith('o') } == 'hello'

startsWith = { value, sequence -> sequence[0] == value }
assert find(input) { startsWith 'p', it } == 'people'

//currying (partial application)
nthInput = nth.curry(input)
assert nthInput(3) == 'people'

third = nth.rcurry(3)
assert third(input) == 'people'

startsWithP = startsWith.curry('p')
assert find (input, startsWithP) == 'people'

findStartsWithP = find.rcurry(startsWithP)
assert findStartsWithP(input) == 'people'

//closure composition
thirdReverse = third >> reverse
assert thirdReverse(input) == 'elpoep'

reverseThird = third << reverse
assert reverseThird(input) == 'hello'

//compose closures into a pipeline
process = third >> reverse >> { nth it, 2 } >> capitalize
assert process(input) == 'L'
