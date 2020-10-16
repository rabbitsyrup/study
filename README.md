study
=============
simple project for personal study

Spec
-------------
- Oracle Cloud Server
- Docker
- SpringBoot
- Mybatis
- Mysql
- Gradle
- Jenkins

Oracle Cloud Server 내부 개념도
-------------
- VCN(가상 클라우드 네트워크)
  - VM Instance
    - docker
      - container for jenkins
      - container for mysql

Workflow 
-------------
- Local PC에서 개발
- Github에 커밋
- 웹훅 트리거로 젠킨스 build 실행
  - gradle로 bootjar 생성
  - docker로 이미지 빌드
  - docker-compose up으로 프록시 및 스프링부트 앱 실행

reference & troubleshooting
-------------
- Docker
  - [Docker inside Docker for Jenkins](https://itnext.io/docker-inside-docker-for-jenkins-d906b7b5f527)
  - [the-simple-way-to-run-docker-in-docker-for-ci](https://tutorials.releaseworksacademy.com/learn/the-simple-way-to-run-docker-in-docker-for-ci) docker-compose 안됨
  - [실행중인 container에 port or volume 추가](https://medium.com/sjk5766/%EC%8B%A4%ED%96%89%EC%A4%91%EC%9D%B8-container%EC%97%90-port-or-volume-%EC%B6%94%EA%B0%80-ae8889344c68)
