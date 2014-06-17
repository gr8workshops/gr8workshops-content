import java.util.Collections.UnmodifiableList;

list = ['b', 'a']

//a tuple constructor is generated
immutable1 = new ImmutableType(10, 'value', list)
assert immutable1.integer == 10
assert immutable1.string == 'value'
assert immutable1.list == list

//a map constructor is generated
immutable2 = new ImmutableType(string: 'value', integer: 10, list: list)
assert immutable2.integer == 10
assert immutable2.string == 'value'
assert immutable2.list == list

//equals is implemented based on fields
assert immutable1 == immutable2
assert !immutable1.is(immutable2)

//hashcode is based on value
map = new HashMap()
map[immutable1] = 'first'
map[immutable2] = 'second'
assert map.size() == 1
assert map[immutable2] == 'second'
assert map[immutable1] == 'second'

//fields cannot be set
try {
	immutable1.integer = 20
	assert false
} catch(any) {
	assert any instanceof ReadOnlyPropertyException
}

//collections are wrapped in unmodifiable collections
assert !immutable1.list.is(list)

try {
	immutable1.list.add('c')
	assert false
} catch(any) {
	assert any instanceof UnsupportedOperationException
}

//collections are defensively copied
assert list == immutable1.list
list.add('c')
assert list != immutable1.list