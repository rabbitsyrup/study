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
  - docker로 이미지 빌드 (참고 : [docker-in-docker](https://tutorials.releaseworksacademy.com/learn/the-simple-way-to-run-docker-in-docker-for-ci, "docker-in-docker"))
  - docker-compose up으로 프록시 및 스프링부트 앱 실행
