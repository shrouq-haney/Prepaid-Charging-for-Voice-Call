#!/bin/bash

# اسم ملف النسخة
output="./backup_calls/calls-$(date '+%Y-%m-%d-%H').txt"

# انسخ كل محتوى CDR إلى ملف جديد باسم الساعة
mv ./calls/calls.txt "$output"
echo "CDR moved to $output"

