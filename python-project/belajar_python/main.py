from ReqTest import ReqTest


def print_req():
    url1 = ReqTest('https://api.github.com/events')
    url1.req_get()


if __name__ == '__main__':
    print_req()
