# zkMethodTemplateRefFormBinding

This is a test code for a ZK issue about calling a method on an`@ref`ed object inside a template in a included zul with form binding.

## Description of the issues

### Method called only once in the template

In the list on the right, we can see that the random `String`s in the second column are all the same, even though the constructor of `SubSubBean` initializes this `String` to be random. The reason for this is that, in `include.zul`, the method `getSubSubBean(each)` is only called once, so every iteration of the template references the same `SubSubBean`.

### `fxStatus` not always correctly handled

The enabled/disabled state of the Save button is binded to `fxStatus.dirty`. When we change the `name` field of a `MainBean` using the input in the top right corner, we see that `fxStatus` is correctly handed. On the other hand, when we change the name of a `SubSubBean`, the `fxStatus` is not updated.

However, once we click the Save button (after having changed the name to enable it), the new value of the `SubSubBean` is correctly saved.