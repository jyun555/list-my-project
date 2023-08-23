import requests
import socket


class ReqTest:
    def __init__(self, url):
        self.url = url

    def req_get(self):
        r = requests.get(self.url)
        print(r.status_code)