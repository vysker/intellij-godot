extends Node
class_name MyClass

class InnerClass:
    pass

var test_var_with_comment = 1 # test
var some_string = "hi"
var a_typed_var: float = 3.14
# some line comment


func _ready():
    pass


func do_things() -> void:
    if something == true:
        return
    
    do_something("yes")
    do_something_else(1, 2, 3, a)
    call_sans_args() 


func funk_with_args(a, b: float, c):
    pass
