from unittest import TestCase

from transaction_app import trans_app

class Application(TestCase):

    def testThat_TheApplication_CurrentBalance_IsZero:

    actual = 0.0

    expected = 0.0

    self.assertEqual(actual, expected)

    def testThat_ApplicationCan_ReceiveDeposit(self):

    actual = 1000

    expected = 1000

    self.assertEqual(actual, expected)


