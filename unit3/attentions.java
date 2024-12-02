# Function definition
def attention(s):
    return s.startswith("Hey, you!")

# Unit tests
def test_attention():
    # Test cases
    assert attention("Hello, my name is Inigo Montoya.") == False
    assert attention("Excuse me, Dr. Kessner?") == False
    assert attention("Hey, you! Give me your code!") == True
    assert attention("Hey, you! Please listen to me.") == True
    assert attention("Hey you! Give me your code!") == False  # Missing comma

# Run the unit tests
test_attention()
print("All tests passed!")
