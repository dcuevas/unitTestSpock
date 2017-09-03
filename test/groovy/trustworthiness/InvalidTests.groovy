package trustworthiness

class UserService {
  String userId1 = '1231321'

  def getUserId() {
    //Go to database a grab the user id

    return userId1
  }
}

class TrustSpec extends spock.lang.Specification {
  static int EXPECTED_USER_ID = 1231321
  UserService userService

  def "should return the expected user id"() {
    setup:
    userService = new UserService()

    when:
    def userId = userService.getUserId()

    then:
    userId == EXPECTED_USER_ID
  }
}
