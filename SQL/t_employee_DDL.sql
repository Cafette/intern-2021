--------------------------------------------------------------------------------
-- address.t_employee のレイアウト変更
--   注意！！：テーブルに依存するオブジェクト（ビューなど）が削除される場合があります。それらのオブジェクトは復元されません。
--   2020/11/07 TK
--------------------------------------------------------------------------------


-- 新テーブルの作成
create table address.t_employee (
  user_id integer not null
  , user_name character varying(50) not null
  , phone_num character varying(11) not null
  , zip_cd char(7) not null
  , user_adr character varying(256) not null
)
/


-- 主キーの作成
alter table address.t_employee  add primary key (user_id)
/


-- コメントの作成
comment on table address.t_employee is '社員マスタ'
/

comment on column address.t_employee.user_id is ''
/

comment on column address.t_employee.user_name is ''
/

comment on column address.t_employee.phone_num is ''
/

comment on column address.t_employee.zip_cd is ''
/

comment on column address.t_employee.user_adr is ''
/

