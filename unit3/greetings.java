# Function definition
def greetings(name):
    """
    Returns a greeting message for the given name.

    Args:
        name (str): The name to include in the greeting.
    
    Returns:
        str: A greeting message.
    """
    return f"Hello, {name}, how are you?"

# Unit tests
import unittest

class TestGreetingsFunction(unittest.TestCase):
    def test_greetings(self):
        self.assertEqual(greetings("Dr. Kessner"), "Hello, Dr. Kessner, how are you?")
        self.assertEqual(greetings("Ascii Cat"), "Hello, Ascii Cat, how are you?")
        self.assertEqual(greetings("Sydneys"), "Hello, Sydneys, how are you?")
        self.assertEqual(greetings("John"), "Hello, John, how are you?")
        self.assertEqual(greetings(""), "Hello, , how are you?")  # Edge case: Empty string

# Run tests
if __name__ == "__main__":
    unittest.main()
NN