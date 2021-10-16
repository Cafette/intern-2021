//値に全角数字が含まれていないか
const isNotIncludedFullWidthNumber = (value) => !/[０-９]/.test(value)

//値が空でないか
const isNotBlank = (value) =>  !!(value || value === 0);

//指定の桁数以上か
const isMoreDigits = (value,digits) => value.length >= digits

//指定の桁数か
export const isEqualDigits = (value,digits) => value.length === digits

//氏名のバリデーション
export const passedNameValidation = (value) => isNotBlank(value) && isNotIncludedFullWidthNumber(value);

//電話番号のバリデーション
export const passedTelValidation = (value) => {
    //10桁以上か
    const isMore10Digits = isMoreDigits(value,10)
    return isNotBlank(value) && isMore10Digits;
}

//郵便番号のバリデーション
export const passedPostalValidation = (value) =>{
    // 登録ボタン押下時に、郵便番号の桁数判定の記載が仕様に無かったのでコメント化しています
    // const is7Digits = isEqualDigits(value,7);
    // return isNotBlank(value) && is7Digits
    return isNotBlank(value)
}

//住所のバリデーション
export const passedAddressValidation = (value) => isNotBlank(value) && isNotIncludedFullWidthNumber(value);