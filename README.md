## 데이터베이스 구조
### 엔티티 관계도 (ERD)
![wanted (4)](https://github.com/user-attachments/assets/b060191d-d131-46fa-bab2-5992f14fa2ac)


## 📋 **[미션3] REST API 설계하기 **

### 👤 **유저 API**

| 기능            | 메서드   | 엔드포인트                       |
|-----------------|----------|----------------------------------|
| 사용자 회원가입  | `POST`   | `/api/users`                     |
| 사용자 로그인    | `POST`   | `/api/users/login`               |
| 사용자 정보 조회 | `GET`    | `/api/users/{userId}`            |
| 사용자 전체 조회 | `GET`    | `/api/users                      |
| 사용자 정보 수정 | `PUT`    | `/api/users/{userId}`            |
| 사용자 삭제      | `DELETE` | `/api/users/{userId}`            |

### 📝 **가게(store) API**

| 기능              | 메서드   | 엔드포인트                       |
|-------------------|----------|----------------------------------|
| 가게 등록          | `POST`     | `/api/store`                     |
| 가게 목록 조회     | `GET`      | `/api/store`                     |
| 특정 가게 조회     | `GET`      | `/api/store/{storeId}`            |
| 가게 수정          | `PUT`      | `/api/store/{storeId}`            |
| 가게 삭제          | `DELETE`   | `/api/store/{storeId}`            |

### 💬 ** 메뉴(menu) API**

| 기능                | 메서드   | 엔드포인트                           |
|---------------------|----------|--------------------------------------|
| 가게/메뉴 등록       | `POST`   | `/api/menu       |
| 가게/메뉴 전체 조회  | `GET`    | `/api/menu/{storeId}`       |
| 가게/특정 메뉴 조회  | `GET`    | `/api/menu/{storeId}/{menuId}`          |
| 가게/메뉴 삭제       | `DELETE` | `/api/menu/{storeId}/{menuId}`          |
| 가게/메뉴 수정       | `PUT`   | `/api/menu/{storeId}/{menuId}`     |


### 💬 ** 주문(order) API**

| 기능                | 메서드   | 엔드포인트                           |
|---------------------|----------|--------------------------------------|
| 주문 등록           | `POST`   | `/api/order`       |
| 주문 전체 조회      | `GET`    | `/api/order/{userId}`       |
| 주문  조회          | `GET`    | `/api/order/{userId}/{orderId}/`      |

